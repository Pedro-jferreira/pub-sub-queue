package com.example.pub_sub_queue.consumer;

import com.example.pub_sub_queue.model.Order;
import com.example.pub_sub_queue.model.enums.OrderStatus;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
public class TransporteConsumer {

    private final StreamBridge streamBridge;

    public TransporteConsumer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    @Bean
    public Consumer<Order> transportePedido() {
        return pedido -> {
            if (pedido.getOrderStatus() == OrderStatus.PEDIDO_PROCESSADO) {
                System.out.println("🚚 Enviando pedido para transporte: " + pedido.getId());
                pedido.setOrderStatus(OrderStatus.PEDIDO_TRANSPORTE);
                streamBridge.send("transportePedido-out-0", pedido);
                System.out.println("📤 Pedido enviado para transporte!");
            }
        };
    }
}
