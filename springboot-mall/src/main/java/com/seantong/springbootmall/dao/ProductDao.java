package com.seantong.springbootmall.dao;

import com.seantong.springbootmall.constant.ProductCategory;
import com.seantong.springbootmall.dto.ProductRequest;
import com.seantong.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId , ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
