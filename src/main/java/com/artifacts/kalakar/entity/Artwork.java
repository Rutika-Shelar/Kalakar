package com.artifacts.kalakar.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Artwork {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    
    @Lob
    private byte[] file;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}