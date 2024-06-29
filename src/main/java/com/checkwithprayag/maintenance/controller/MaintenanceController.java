package com.checkwithprayag.maintenance.controller;

import com.checkwithprayag.scheduler.DataProcessServiceTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MaintenanceController {

    @Autowired
    private DataProcessServiceTask serviceTask;

    @GetMapping("/api/v1/trigger-task")
    public ResponseEntity<String> triggerTask() throws IOException {
        serviceTask.performTask();
        return ResponseEntity.ok("success!");
    }

}
