package com.example.producer.controller;

import com.example.producer.entity.Tourism;
import com.example.producer.service.TourismService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/pro")
public class ProducerController {
    @Resource
    TourismService tourismService;

    @GetMapping("/list")
    public List<Tourism> getTourismList() {
        return tourismService.getTourismList();
    }
}
