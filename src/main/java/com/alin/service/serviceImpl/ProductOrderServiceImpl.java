package com.alin.service.serviceImpl;

import com.alin.entity.ProductOrder;
import com.alin.service.ProductClient;
import com.alin.service.ProductOrderService;
import com.alin.utils.JsonUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2019/4/1.
 */
@Service
public class ProductOrderServiceImpl implements ProductOrderService {

    @Autowired
    private ProductClient productClient;

    @Override
    public ProductOrder save(int userId, int productId) {

        String result = productClient.findById(productId);
        JsonNode jsonNode = JsonUtils.str2JsonNode(result);

        //获取商品详情
        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setId(productId);
        productOrder.setUserId(userId);
        productOrder.setProductName(jsonNode.get("name").toString());
        productOrder.setPrice(Integer.parseInt(jsonNode.get("price").toString()));
        return productOrder;
    }
}
