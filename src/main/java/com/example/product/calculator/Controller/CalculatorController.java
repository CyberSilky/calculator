package com.example.product.calculator.Controller;

import com.example.product.calculator.Model.ItemInfo;
import com.example.product.calculator.Service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @GetMapping("/health")
    public String healthCheck() {
        return "This application is up and running!";
    }
    @PostMapping("/calculate")
    public ItemInfo calculateCost(@RequestBody ItemInfo item) {
        return service.calculate(item);
    }
}
