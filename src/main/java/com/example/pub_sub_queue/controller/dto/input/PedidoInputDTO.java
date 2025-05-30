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

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDateTime dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "PedidoInputDTO{" +
                "dataPedido=" + dataPedido +
                ", dataEntrega=" + dataEntrega +
                ", descricao='" + descricao + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
