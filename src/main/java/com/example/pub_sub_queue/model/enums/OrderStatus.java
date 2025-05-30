package com.example.pub_sub_queue.model.enums;

public enum OrderStatus {
    PEDIDO_CRIADO(1),
    PEDIDO_PROCESSADO(2),
    PEDIDO_TRANSPORTE(3),
    PEDIDO_ENTREGUE(4);

    private final int status;

    OrderStatus(int status) {
        this.status = status;
    }

    public int getPedidoStatus() {
        return status;
    }
}
