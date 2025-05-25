package com.example.pub_sub_queue.controller;

import com.example.pub_sub_queue.controller.dto.input.PedidoInputDTO;
import com.example.pub_sub_queue.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    PedidoService pedidoService;

    @PostMapping("/createPedido")
    public String createPedido(@RequestBody PedidoInputDTO pedidoInputDTO) {
        return "Pedido criado com sucesso!";
    }

    @GetMapping("/getPedidos")
    public List<String> getPedidos() {
        return List.of("Pedido 1", "Pedido 2");
    }
}
