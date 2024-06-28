package com.checkwithprayag.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Getter
@Setter
@Builder
@Document(collection = "time_logs")
public class TimeLog {
    @MongoId
    private String id;
    @DBRef
    private Gig gig;
    @DBRef
    private User freelancer;
    private double hoursWorked;
    private Date workDate;
    private String description;
    private Date createdAt;
}