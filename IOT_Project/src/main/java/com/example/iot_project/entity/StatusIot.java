package com.example.iot_project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dbo_status_iot")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusIot implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name = "temperature",nullable = false)
    private Double temperature;

    @Column(name = "humidity",nullable = false)
    private Double humidity;

    @Column(name = "wind_speed",nullable = false)
    private Double windSpeed;

    @Column(name = "chikenNumber",nullable = false)
    private Long chikenNumber;
}
