package com.checkwithprayag.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "time_logs")
public class TimeLog {
    @Id
    private String id;
    private Double hoursWorked;
    private Date workDate;
    private String description;
    private LocalDateTime createdAt;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gig_id")
    private Gig gig;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "freelancer_id")
    private User freelancer;

}