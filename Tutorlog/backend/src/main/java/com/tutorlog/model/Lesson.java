package com.tutorlog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "lessons")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    private String id;
    
    private String title;
    private String description;
    private String subject;
    
    private String youtubeLink;
    
    private List<String> pdfLinks;
    
    private String requiredSubscription;
    
    private int duration;
    private String difficulty;
    
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();
    
    private boolean isPublished = true;
}