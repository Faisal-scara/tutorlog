package com.tutorlog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    
    private String fullName;
    private String email;
    
    @JsonIgnore
    private String password;
    
    private String subscriptionLevel = "FREE";
    
    private LocalDateTime subscriptionStartDate;
    private LocalDateTime subscriptionEndDate;
    
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    
    private boolean isActive = true;
    private String role = "USER";
}