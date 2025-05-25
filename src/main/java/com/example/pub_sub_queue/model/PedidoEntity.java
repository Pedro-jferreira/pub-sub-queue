package com.example.pub_sub_queue.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PedidoEntity {
    private String codigo;
    private Integer valor;
    private ClienteEntity cliente;
    private LocalDateTime dataPedido;
    private LocalDateTime dataEntrega;
    private String nome;
    private String descricao;
}
