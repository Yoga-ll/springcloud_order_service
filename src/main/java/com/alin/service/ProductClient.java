package com.alin.service;

import com.alin.service.serviceImpl.FallBack;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/4/2.
 */

/**
 * 商品服务客户端
 */

@FeignClient(name = "product-service", fallback = FallBack.class)
public interface ProductClient {

    @GetMapping("/api/v1/product/find")
    String findById(@RequestParam("id") int id);

}
