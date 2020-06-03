package com.alin.service;

import com.alin.entity.ProductOrder;

/**
 * Created by Administrator on 2019/4/1.
 */
public interface ProductOrderService {

    ProductOrder save(int userId, int productId);
}
