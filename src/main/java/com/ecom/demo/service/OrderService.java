package com.ecom.demo.service;

import com.ecom.demo.dto.request.OrderRequest;
import com.ecom.demo.dto.response.OrderResponse;



import java.util.List;
public interface OrderService {
    List<OrderResponse> getAllOrders();
    OrderResponse getOrderById(Long id);
    Long createOrder(OrderRequest orderRequest);
    void updateOrder(Long id, OrderRequest orderRequest);
    void deleteOrder(Long id);



}
