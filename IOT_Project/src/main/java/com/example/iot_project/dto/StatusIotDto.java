package com.example.iot_project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusIotDto {
    private Long ID;

    private Double temperature;

    private Double humidity;

    private Double windSpeed;

    private Long chikenNumber;

    public StatusIotDto(Double temperature, Double humidity, Double windSpeed, Long chikenNumber) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.chikenNumber = chikenNumber;
    }
}
