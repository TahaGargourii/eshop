package com.ecom.demo.mapper;

import com.ecom.demo.dto.response.ProductResponse;
import com.ecom.demo.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public class ProductMapper {

        ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

        public ProductResponse productToProductResponse(Product product) {
                ProductResponse productResponse = new ProductResponse(
                        product.getId(),product.getName(),product.getDescription(), product.getPrice(), product.getQuantity(), product.getCategory()
                );
                return productResponse;
        };
}
