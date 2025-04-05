package com.Algonitefintech.fintech_security.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "finTechUsers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @NonNull
    @Indexed(unique = true)
    private String phoneNumber;
    @NonNull
    private String budget;
    @NonNull
    private String savings;

    private List<String> roles;

}

