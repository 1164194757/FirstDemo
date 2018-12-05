package com.luban.service;

import com.luban.dao.OrderDao;
import com.luban.dao.ProductDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BuyService {
    @Resource
    private ProductDao productDao;
    @Resource
    private OrderDao orderDao;

    public void update(){
        productDao.update();
        orderDao.update();
    }
}
