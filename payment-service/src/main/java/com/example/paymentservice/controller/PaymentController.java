package com.example.paymentservice.controller;


import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/do-payment")
    public Payment doPayment(@RequestBody Payment payment) {
        payment.setPaymentStatus(paymentService.paymentInfo());
        return paymentService.doPayment(payment);
    }
    @GetMapping("/{orderId}")
    public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
        return paymentService.findPaymentHistoryByOrderId(orderId);
    }

}
