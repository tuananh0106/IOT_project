package com.example.iot_project.service.impl;

import com.example.iot_project.dto.StatusIotDto;
import com.example.iot_project.entity.StatusIot;
import com.example.iot_project.repository.StatusIotReponsitory;
import com.example.iot_project.service.StatusIotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusIotServiceImpl implements StatusIotService {
    @Autowired
    private StatusIotReponsitory statusIotReponsitory;

    @Override
    public List<StatusIotDto> view() {
        List<StatusIotDto> response = new ArrayList<>();
        StatusIot statusIotList = statusIotReponsitory.theLastInfo().get(0);
        response.add(new StatusIotDto(
                statusIotList.getTemperature(),
                statusIotList.getHumidity(),
                statusIotList.getWindSpeed(),
                statusIotList.getChikenNumber()));
        return response;
    }
}
