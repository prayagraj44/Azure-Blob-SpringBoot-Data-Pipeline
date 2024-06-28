package com.checkwithprayag.domain.entity;

import com.checkwithprayag.domain.enums.GigStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Builder
@Document(collection = "bids")
public class Bid {
    @MongoId
    private String id;
    @DBRef
    private Gig gig;
    @DBRef
    private User freelancer;
    private BigDecimal amount;
    private int daysToComplete;
    private GigStatus status;
    private Date createdAt;
}
