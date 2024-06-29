package com.checkwithprayag.scheduler;

import com.checkwithprayag.service.DataProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DataProcessServiceTask {

    @Autowired
    private DataProcessService service;

    @Scheduled(cron = "${data.process.cron.expression}")
    public void performTask() throws IOException {
        service.process();
    }

}
