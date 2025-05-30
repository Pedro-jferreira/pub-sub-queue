package com.example.pub_sub_queue.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue filaProcessamento() {
        return new Queue("fila-processamento-pedidos", true);
    }

    @Bean
    public Queue pedidoProcessado() {
        return new Queue("pedido-processado", true);
    }
}
