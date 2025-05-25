package com.example.pub_sub_queue.model.enums;

public enum PedidoStatus {
    PEDIDO_PROCESSADO(1),
    PEDIDO_ENTREGUE(2);

    private final int status;

    PedidoStatus(int status) {
        this.status = status;
    }

    public int getPedidoStatus() {
        return status;
    }
}
