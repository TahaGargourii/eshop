package com.ecom.demo.mapper;

import com.ecom.demo.dto.response.OrderResponse;
import com.ecom.demo.entity.Order;
import org.mapstruct.factory.Mappers;

public class OrderMapper {

    // Instance for static access (matches your ProductMapper style)
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    // Method to convert Order → OrderResponse (like Product → ProductResponse)
    public OrderResponse orderToOrderResponse(Order order) {
        return new OrderResponse(
                order.getId(),
                ( order.getUser() !=null ) ? order.getUser().getId() :null,
                order.getItems(),        // Assume Order has a list of OrderItems
                order.getOrderDate(),
                order.getTotalAmount(),
                order.getStatus()
        );
    }
}

