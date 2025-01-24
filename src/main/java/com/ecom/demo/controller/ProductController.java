package com.ecom.demo.controller;

import com.ecom.demo.dto.request.ProductRequest;
import com.ecom.demo.dto.response.ProductResponse;
import com.ecom.demo.entity.Product;
import com.ecom.demo.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
/*
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest request) {
        // Map request to entity
        return ResponseEntity.ok(productService.createProduct(...));
    }*/

    @GetMapping
    public ResponseEntity <List<ProductResponse>> getAllProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return ResponseEntity.ok("Product with ID " + id + " deleted successfully!");
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> createProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return ResponseEntity.ok("Product with ID " + id + " deleted successfully!");
    }
}
