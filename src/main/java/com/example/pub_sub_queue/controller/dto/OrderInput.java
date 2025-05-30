package com.example.pub_sub_queue.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInput {
    private String description;
    private String nameClient;
    private Integer value;

}
