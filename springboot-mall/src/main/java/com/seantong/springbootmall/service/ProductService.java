package com.seantong.springbootmall.service;

import com.seantong.springbootmall.dto.ProductRequest;
import com.seantong.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

}
