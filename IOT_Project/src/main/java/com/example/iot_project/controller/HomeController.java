package com.example.iot_project.controller;

import com.example.iot_project.dto.StatusIotDto;
import com.example.iot_project.dto.UserDto;
import com.example.iot_project.service.StatusIotService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {
    @Autowired
    private StatusIotService statusIotService;

    @ModelAttribute("userdto")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping("/home")
    public String showHomeForm(@ModelAttribute("statusIot") UserDto userDto, Model model) {
        List<StatusIotDto> statusIotDto = statusIotService.view();
        model.addAttribute("statusIotList", statusIotDto);
        return "/home";
    }


}
