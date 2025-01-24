package com.ecom.demo.dto.request;

import com.ecom.demo.entity.Category;

public record ProductRequest(

         String name,
         String description,
         Double price,
         Integer quantity,

         Category category) {
}
