package com.ecom.demo.service;


import com.ecom.demo.dto.request.ProductRequest;
import com.ecom.demo.dto.response.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductResponse> getAllProducts();
    ProductResponse getProductById(Long id);
    void deleteProductById(Long id);
    Long createProduct(ProductRequest productRequest);
    void updateProduct(Long id, ProductRequest productRequest);
}
