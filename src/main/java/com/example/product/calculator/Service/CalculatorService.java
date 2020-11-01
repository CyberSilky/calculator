package com.example.product.calculator.Service;


import com.example.product.calculator.Model.ItemInfo;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public ItemInfo calculate(ItemInfo info) {

        double total = info.getPrice() * info.getQuantity();
        double total_with_tax = total + (total * info.getTax());

        info.setTotal(total_with_tax);
        return info;

    }
}
