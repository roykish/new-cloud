package com.example.paymentservice.service;


import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentInfo());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
    public String paymentInfo(){
        return new Random().nextBoolean()?"success": String.valueOf(false);
    }
    public Payment findPaymentHistoryByOrderId(int orderId){
        return paymentRepository.findByOrderId(orderId);
    }
}
