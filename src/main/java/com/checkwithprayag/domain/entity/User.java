package com.checkwithprayag.domain.entity;

import com.checkwithprayag.domain.enums.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Document(collection = "users")
public class User {

    @MongoId
    private String id;
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private LocalDateTime createdAt;

}
