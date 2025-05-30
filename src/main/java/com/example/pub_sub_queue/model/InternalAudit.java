package com.example.pub_sub_queue.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class InternalAudit {
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    @Builder.Default
    private LocalDateTime auditDateTime = LocalDateTime.now();
    @Builder.Default
    private List<Order> Orders = new ArrayList<>();

    public void  addOrder(Order order) {
        Orders.add(order);
    }
}
