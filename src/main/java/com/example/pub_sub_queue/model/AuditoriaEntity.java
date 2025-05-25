package com.example.pub_sub_queue.model;

import com.example.pub_sub_queue.model.enums.PedidoStatus;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AuditoriaEntity {
    private Long auditLogId;
    private LocalDateTime auditDateTime;
    private PedidoStatus pedidoStatus;
    private List<PedidoEntity> pedidosList;
}
