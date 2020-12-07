package com.example.producer.service;

import com.example.producer.entity.Tourism;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TourismServiceImplTest {
    @Resource
    TourismService tourismService;
    @Test
    public void aaa(){
        System.out.println(tourismService.getTourismList());
    }
}
