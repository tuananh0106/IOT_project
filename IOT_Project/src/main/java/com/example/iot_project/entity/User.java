package com.example.iot_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dbo_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "user_display_name",nullable = false)
    private String UserDisplayName;

    @Column(name = "password",nullable = false)
    private String Password;

    @Column(name = "creation_date",nullable = false)
    private String CreationDate;

    @Column(name = "role",nullable = false)
    private String Role;
}
