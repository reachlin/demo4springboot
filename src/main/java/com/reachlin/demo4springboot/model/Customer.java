package com.reachlin.demo4springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data // for gettter and setters
@Document // for mongodb
@JsonIgnoreProperties(ignoreUnknown = true) // prevents future new fields breaking the parser
public class Customer {
    @Id
    private String id;

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("created_at")
    private LocalDateTime createdAt = LocalDateTime.now();
}
