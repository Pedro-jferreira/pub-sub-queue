package com.example.pub_sub_queue.controller.dto;

import com.example.pub_sub_queue.model.Order;

public class OrderMapper {
    public static Order toOrder(OrderInput input) {
        return Order.builder()
                .description(input.getDescription())
                .nameCliente(input.getNameClient())
                .value(input.getValue())
                .build();
    }
}