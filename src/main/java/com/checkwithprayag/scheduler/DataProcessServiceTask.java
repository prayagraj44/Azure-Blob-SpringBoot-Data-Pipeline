package com.checkwithprayag.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DataProcessServiceTask {

    @Scheduled(cron = "${cron.expression}")
    public void processData(){

    }

}
