package com.checkwithprayag.domain.entity;

import com.checkwithprayag.domain.enums.GigStatus;
import com.checkwithprayag.domain.enums.Scope;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
@Document(collection = "projects")
public class Gig {
    @MongoId
    String id;
    @DBRef
    User client;
    String title;
    String description;
    Scope scope;
    GigStatus status;
    BigDecimal budget;
    LocalDateTime createdAt;
}
