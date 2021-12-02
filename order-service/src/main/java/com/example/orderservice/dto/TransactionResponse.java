package com.example.orderservice.dto;


import com.example.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;
}
