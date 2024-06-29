package com.checkwithprayag.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "gig")
public class Gig {
    @Id
    private String id;
    private String title;
    private String description;
    private String scope;
    private String status;
    private Double budget;
    private LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private User client;


}