package com.example.pub_sub_queue.consumer;

import com.example.pub_sub_queue.model.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class NotificationConsumer {

    @Bean
    public Consumer<Order> notificacaoPedidoProcessado() {
        return pedido -> System.out.println("🔔 Notificando cliente: " + pedido.getNameCliente() + " sobre o pedido " + pedido.getId());
    }

    @Bean
    public Consumer<Order> notificacaoPedidoEmTransporte() {
        return pedido -> System.out.println("📦 Notificando cliente: " + pedido.getNameCliente() + " que o pedido está em transporte.");
    }

    @Bean
    public Consumer<Order> notificacaoPedidoEntregue(){
        return pedido -> System.out.println("🔔 Notificando cliente: " + pedido.getNameCliente() + " que o pedido " + pedido.getId() + " foi entregue.");
    }
}
