package com.example.pub_sub_queue.controller.dto.output;

import com.example.pub_sub_queue.controller.dto.SimplePedidoDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class PedidoOutputDTO extends SimplePedidoDTO {
    private String codigo;
    private LocalDateTime dataPedido;
    private LocalDateTime dataEntrega;
    private String descricao;
}
