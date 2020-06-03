package com.alin.service.serviceImpl;

import com.alin.service.ProductClient;
import org.springframework.stereotype.Component;

@Component
public class FallBack implements ProductClient {
    @Override
    public String findById(int id) {
        System.out.println("熔断，默认回调函数");
        return "熔断，默认回调函数";
    }
}
