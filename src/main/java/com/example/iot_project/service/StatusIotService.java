package com.example.iot_project.service;

import com.example.iot_project.dto.StatusIotDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusIotService {
    List<StatusIotDto> view();
}
