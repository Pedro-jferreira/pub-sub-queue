package com.example.pub_sub_queue.consumer;

import com.example.pub_sub_queue.model.Order;
import com.example.pub_sub_queue.model.enums.OrderStatus;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.function.Consumer;

@Service
public class DeliveryConsumer {

    private final StreamBridge streamBridge;

    public DeliveryConsumer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @Bean
    public Consumer<Order> entregarPedido() {
        return pedido -> {
            if (pedido.getOrderStatus() == OrderStatus.PEDIDO_TRANSPORTE) {
                System.out.println("🚚 Pedido saindo para entrega: " + pedido.getId());
                pedido.setOrderStatus(OrderStatus.PEDIDO_ENTREGUE);
                pedido.setOrderDelivered(LocalDateTime.now());
                streamBridge.send("entregarPedido-out-0", pedido);
                System.out.println("📤 Pedido entregue ao cliente!");
            }
        };
    }
}
