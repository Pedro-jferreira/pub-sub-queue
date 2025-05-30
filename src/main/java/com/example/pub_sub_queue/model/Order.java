package com.example.pub_sub_queue.model;

import com.example.pub_sub_queue.model.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String description;
    private String nameCliente;
    private Integer value;
    @Builder.Default
    private OrderStatus orderStatus = OrderStatus.PEDIDO_CRIADO;
    @Builder.Default
    private LocalDateTime createDate = LocalDateTime.now();
    private LocalDateTime processingDate;
    private LocalDateTime orderDelivered;
}
