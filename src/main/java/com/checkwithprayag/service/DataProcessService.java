package com.checkwithprayag.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level= AccessLevel.PRIVATE)
public class DataProcessService {

    @Autowired
    AzureBlobService azureBlobService;

    public void process(){

    }



}
