package com.seantong.springbootmall.dao;

import com.seantong.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
