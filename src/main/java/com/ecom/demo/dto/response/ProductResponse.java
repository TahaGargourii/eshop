package com.ecom.demo.dto.response;

import com.ecom.demo.entity.Category;

public record ProductResponse(
        Long id,
        String name,
        String description,
        Double price,
        Integer quantity,
        Category category
) {
}
