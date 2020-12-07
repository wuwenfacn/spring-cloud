package com.example.producer.service.impl;

import com.example.producer.entity.Tourism;
import com.example.producer.mapper.TourismMapper;
import com.example.producer.service.TourismService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TourismServiceImpl implements TourismService {
    @Resource
    TourismMapper tourismMapper;

    @Override
    public List<Tourism> getTourismList() {
        return tourismMapper.selectTourismList();
    }
}
