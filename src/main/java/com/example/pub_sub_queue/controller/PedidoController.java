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

    // Simula o banco de dados
    ArrayList<PedidoInputDTO> pedidos = new ArrayList<>();

    @PostMapping("/createPedido")
    public ResponseEntity<String> createPedido(@RequestBody PedidoInputDTO pedidoInputDTO) {
        pedidos.add(pedidoInputDTO);
        return new ResponseEntity<>("Pedido criado com sucesso: " + pedidos, HttpStatus.CREATED);
    }

    @GetMapping("/getAllPedidos")
    public ResponseEntity<List<String>> getAllPedidos() {
        return new ResponseEntity<>(List.of(pedidos.toString()), HttpStatus.OK);
    }

    @GetMapping("/getPedido/{codigo}")
    public ResponseEntity<String> getPedido(@PathVariable String codigo) {
        PedidoInputDTO pedido = pedidos.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst().orElse(null);
        return new ResponseEntity<>("Pedido: " + pedido, HttpStatus.OK);
    }
}
