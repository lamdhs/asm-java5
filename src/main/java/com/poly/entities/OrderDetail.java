//package com.poly.entities;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "ordersdetails")
//public class OrderDetail {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id", referencedColumnName = "id")
//    private Order order;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    private Product product;
//
//    private float price;
//
//    private int quantity;
//
//    // constructors, getters and setters
//}