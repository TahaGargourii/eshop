package com.ecom.demo.service.impl;

import com.ecom.demo.dto.request.ProductRequest;
import com.ecom.demo.dto.response.ProductResponse;
import com.ecom.demo.entity.Product;
import com.ecom.demo.mapper.ProductMapper;
import com.ecom.demo.repository.ProductRepository;
import com.ecom.demo.service.ProductService;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<ProductResponse> getAllProducts() {
        List<ProductResponse> productResponses = new ArrayList<>();
        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            if (product != null) {
                ProductResponse productResponse = productMapper.productToProductResponse(product);
                productResponses.add(productResponse);
            }
        }
        return productResponses;
    }

    @Override
    public ProductResponse getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        ProductResponse productResponse = null;
        if (product.isPresent()) {
            productResponse = productMapper.productToProductResponse(product.get());
        } else {
            return null;
        }

        return productResponse;
    }

    @Override
    public void deleteProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.deleteById(id);
        }
    }

    @Override
    public Long createProduct(ProductRequest productRequest) {
        return 0L;
    }

    @Override
    public void updateProduct(Long id, ProductRequest productRequest) {

    }
}
