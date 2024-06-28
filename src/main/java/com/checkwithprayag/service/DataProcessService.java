package com.checkwithprayag.service;

import com.checkwithprayag.domain.entity.Gig;
import com.checkwithprayag.domain.repository.GigRepository;
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
@FieldDefaults(level= AccessLevel.PRIVATE)
public class DataProcessService {

    @Autowired
    AzureBlobService azureBlobService;

    @Autowired
    GigRepository gigRepository;

    public void process() throws IOException {

        var allGigs = gigRepository.findAll();

        if(!allGigs.isEmpty()) {
            var gigJsonInputStream = convertObjectToJsonInputStream(allGigs.get(0));
            azureBlobService.uploadToBlob(getBlobFilename(),gigJsonInputStream,gigJsonInputStream.available());
        }

    }

     InputStream convertObjectToJsonInputStream(Gig gig) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        byte[] gigJsonBytes = mapper.writeValueAsBytes(gig);
        return new ByteArrayInputStream(gigJsonBytes);
    }

    String getBlobFilename() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HHmmss");
        return now.format(formatter) + "-gig-"+".json";
    }





}
