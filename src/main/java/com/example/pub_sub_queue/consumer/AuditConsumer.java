package com.example.pub_sub_queue.consumer;

import com.example.pub_sub_queue.model.InternalAudit;
import com.example.pub_sub_queue.model.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AuditConsumer {
    private InternalAudit internalAudit =  InternalAudit.builder().build();

    @Bean
    public Consumer<Order> auditoriaPedidoProcessado() {
        return pedido -> {
            internalAudit.addOrder(pedido);
            System.out.println("📝 Auditando pedido: " + pedido.getId());
        };
    }

    @Bean
    public Consumer<Order> auditoriaPedidoEmTransporte() {
        return pedido -> {
            internalAudit.addOrder(pedido);
            System.out.println("🧾 Auditando pedido em transporte: " + pedido.getId());
        };
    }

    @Bean
    public Consumer<Order> auditoriaPedidoEntregue(){
        return pedido -> {
            internalAudit.addOrder(pedido);
            System.out.println("📚 Auditoria finalizada: Pedido " + pedido.getId() + " entregue.");
        };
    }
}
