package com.example.pub_sub_queue.controller;

import com.example.pub_sub_queue.controller.dto.OrderInput;
import com.example.pub_sub_queue.producer.OrderProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class OrderController {
    @Autowired
    private final OrderProducer orderProducer;

    @PostMapping
    public ResponseEntity<Void> criarPedido(@RequestBody OrderInput orderInput) {
        orderProducer.enviarPedidoParaFila(orderInput);
        return ResponseEntity.accepted().build();
    }
}
