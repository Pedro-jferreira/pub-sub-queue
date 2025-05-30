package com.example.pub_sub_queue.producer;
import com.example.pub_sub_queue.controller.dto.OrderInput;
import com.example.pub_sub_queue.controller.dto.OrderMapper;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private final StreamBridge streamBridge;

    public OrderProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }


    public void enviarPedidoParaFila(OrderInput order) {
        streamBridge.send("enviarPedido-out-0", OrderMapper.toOrder(order));
    }
}

