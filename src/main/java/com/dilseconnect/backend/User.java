package com.dilseconnect.backend;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_Info")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "age")
    private int age;


}
