package com.example.entity;

// import java.time.LocalDate;

public class Order {
    private int orderId;
    private String customerName;
    private String orderDate;
    private double totalAmount;
    private String orderStatus;

    public Order(int orderId, String customerName, String orderDate, double totalAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public Order(String customerName, String orderDate, double totalAmount, String orderStatus) {
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "OrderId=" + orderId + "\ncustomerName=" + customerName + "\norderDate=" + orderDate
                + "\ntotalAmount=" + totalAmount + "\norderStatus=" + orderStatus;
    }
 
    
}
