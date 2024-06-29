package com.checkwithprayag.service;

import com.checkwithprayag.domain.repository.BidRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataProcessService {

    @Autowired
    AzureBlobService azureBlobService;

    @Autowired
    BidRepository bidRepository;

    public void process() throws IOException {

        var allBids = bidRepository.findAll();

        if (!allBids.isEmpty()) {
            var gigJsonInputStream = convertObjectToJsonInputStream(allBids);
            azureBlobService.uploadToBlob(getBlobFilename(), gigJsonInputStream, gigJsonInputStream.available());
        }

    }

    InputStream convertObjectToJsonInputStream(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        byte[] gigJsonBytes = mapper.writeValueAsBytes(object);
        return new ByteArrayInputStream(gigJsonBytes);
    }

    String getBlobFilename() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "all-bids-" + now.format(formatter) + ".json";
    }





}
