package com.example.pub_sub_queue.controller;

import com.example.pub_sub_queue.controller.dto.input.PedidoInputDTO;
import com.example.pub_sub_queue.service.impl.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    PedidoServiceImpl pedidoService;

    @PostMapping("/createPedido")
    public ResponseEntity<String> createPedido(@RequestBody PedidoInputDTO pedidoInputDTO) {
        ArrayList<PedidoInputDTO> pedidos = new ArrayList<>();
        pedidos.add(pedidoInputDTO);
        return new ResponseEntity<>("Pedido criado com sucesso: " + pedidos, HttpStatus.OK);
    }

    @GetMapping("/getAllPedidos")
    public List<String> getAllPedidos() {
        return List.of("Pedido 1", "Pedido 2");
    }

    @GetMapping("/getPedido/{codigo}")
    public String getPedido(@PathVariable String codigo) {
        return "Pedido 1";
    }
}
