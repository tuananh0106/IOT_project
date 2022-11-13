package com.example.iot_project.repository;

import com.example.iot_project.entity.StatusIot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StatusIotReponsitory extends JpaRepository<StatusIot, Long> {
    @Query("SELECT si from StatusIot si order by si.ID")
    List<StatusIot> theLastInfo();
}
