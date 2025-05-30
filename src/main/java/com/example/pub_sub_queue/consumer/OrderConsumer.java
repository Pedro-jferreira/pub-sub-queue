package com.example.pub_sub_queue.consumer;

import com.example.pub_sub_queue.model.Order;
import com.example.pub_sub_queue.model.enums.OrderStatus;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class OrderConsumer {

    private final StreamBridge streamBridge;

    public OrderConsumer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }


    @Bean
    public Consumer<Order> processarPedido() {
        return pedido -> {
            System.out.println("Processando pedido: " + pedido);
            pedido.setOrderStatus(OrderStatus.PEDIDO_PROCESSADO);
            streamBridge.send("processarPedido-out-0", pedido);
            System.out.println("Pedido processado e evento publicado!");
        };
    }
}
