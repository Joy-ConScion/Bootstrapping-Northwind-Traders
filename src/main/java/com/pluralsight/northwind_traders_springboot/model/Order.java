package com.pluralsight.northwind_traders_springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Column(name = "CustomerId")
    private String customerId;

    @Column(name = "EmployeeId")
    private int employeeId;

    @Column(name = "ShipName")
    private String shipName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderId")
    private int orderId;

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
