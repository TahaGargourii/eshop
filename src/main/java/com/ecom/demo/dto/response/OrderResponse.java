package com.ecom.demo.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public class OrderResponse {

    private Long id;
    private Long userId;
    private List<OrderItemResponse> items;
    private LocalDateTime orderDate;
    private double totalAmount;
    private String status;
}
