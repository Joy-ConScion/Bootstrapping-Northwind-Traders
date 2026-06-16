package com.pluralsight.northwind_traders_springboot.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId")
    private int productId;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private String supplierId;

    @Column(name = "CategoryID")
    private int categoryId;

    @Column(name = "QuantityPerUnit")
    private int quantityPerUnit;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "UnitsInStock")
    private int unitsInStock;

    @Column(name = "UnitsOnOrder")
    private int unitsOnOrder;

    @Column(name = "ReorderLevel")
    private int reorderLevel;

    @Column(name = "Discontinued")
    private boolean discontinued;



}
