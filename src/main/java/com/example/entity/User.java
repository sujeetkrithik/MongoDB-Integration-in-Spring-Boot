package com.example.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Data
@Document(collection="user")
public class User {

    @Id
    private int id;
    private String name;
    private String email;
    private String password;
    private String mobile;
}
