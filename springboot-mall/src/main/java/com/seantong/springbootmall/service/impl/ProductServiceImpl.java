package com.seantong.springbootmall.service.impl;

import com.seantong.springbootmall.dao.ProductDao;
import com.seantong.springbootmall.model.Product;
import com.seantong.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId){
        return productDao.getProductById(productId);
    }
}
