package com.example.product.calculator.Model;

public class ItemInfo {

    private double tax;
    private double price;
    private int quantity;
    private double total;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax / 100;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
