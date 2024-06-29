package com.checkwithprayag.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "bid")
public class Bid {
    @Id
    private String id;
    private Double amount;
    private Integer daysToComplete;
    private String status;
    private LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gig_id")
    private Gig gig;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "freelancer_id")
    private User freelancer;

}