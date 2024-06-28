package com.checkwithprayag.service;

import com.azure.storage.blob.BlobClientBuilder;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
@FieldDefaults(level= AccessLevel.PRIVATE)
public class AzureBlobService {

    @Value("${azure.storage.connection-string}")
    String connectionString;

    @Value("${azure.storage.container-name}")
    String containerName;

    public void uploadToBlob(String blobName, InputStream data, long length) {

        BlobClientBuilder blobClientBuilder = new BlobClientBuilder()
                .connectionString(connectionString)
                .containerName(containerName)
                .blobName(blobName);

        blobClientBuilder.buildClient().upload(data, length, false);
    }


}
