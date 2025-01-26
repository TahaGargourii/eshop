package com.ecom.demo.service.impl;

import com.ecom.demo.dto.request.OrderRequest;
import com.ecom.demo.dto.response.OrderResponse;
import com.ecom.demo.repository.OrderRepository;
import com.ecom.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository ;


    @Override
    public List<OrderResponse> getAllOrders() {
        return null;
    }

    @Override
    public OrderResponse getOrderById(Long id) {
        return null;
    }

    @Override
    public Long createOrder(OrderRequest orderRequest) {
        return 0L;
    }

    @Override
    public void updateOrder(Long id, OrderRequest orderRequest) {

    }

    @Override
    public void deleteOrder(Long id) {

    }
}
