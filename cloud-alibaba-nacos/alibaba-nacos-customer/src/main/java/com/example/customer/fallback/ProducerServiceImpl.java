package com.example.customer.fallback;

import com.example.customer.entity.Tourism;
import com.example.customer.feign.ProducerService;
import org.springframework.stereotype.Service;

import java.util.List;

// 降级，返回默认的数据
@Service
public class ProducerServiceImpl implements ProducerService {

    @Override
    public List<Tourism> test() {
        return null;
    }
}
