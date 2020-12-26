package com.thoughtworks;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public LineItem(String description, double price, int quantity) {
        super();
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String render() {
        StringBuilder lineItemFormatString = new StringBuilder();
        lineItemFormatString.append(getDescription());
        lineItemFormatString.append('\t');
        lineItemFormatString.append(getPrice());
        lineItemFormatString.append('\t');
        lineItemFormatString.append(getQuantity());
        lineItemFormatString.append('\t');
        lineItemFormatString.append(totalAmount());
        lineItemFormatString.append('\n');
        return lineItemFormatString.toString();
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    double totalAmount() {
        return price * quantity;
    }
}