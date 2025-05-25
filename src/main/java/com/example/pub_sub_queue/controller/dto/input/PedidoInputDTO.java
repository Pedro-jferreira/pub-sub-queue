package com.example.pub_sub_queue.controller.dto.input;

import com.example.pub_sub_queue.controller.dto.SimplePedidoDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class PedidoInputDTO extends SimplePedidoDTO {
    private LocalDateTime dataPedido;
    private LocalDateTime dataEntrega;
    private String descricao;
    private String codigo;
}
