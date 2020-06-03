package com.alin.controller;

import com.alin.service.ProductOrderService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Administrator on 2019/4/1.
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    @Autowired
    private ProductOrderService productOrderService;

    @RequestMapping("save")
    public Object save(@RequestBody String requestBody) {
        JsonObject parse = (JsonObject) new JsonParser().parse(requestBody);
        int userId = parse.get("userId").getAsInt();
        System.out.println(userId);
        int productId = parse.get("productId").getAsInt();
        System.out.println(productId);

        return productOrderService.save(userId, productId);
    }
}
