//package com.poly.entities;
//
//import java.util.Date;
//import java.util.Locale.Category;
//import java.util.Set;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//
//
//@Entity
//@Table(name = "products")
//public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String name;
//
//    private String image;
//
//    private float price;
//
//    private Date createDate;
//
//    private int quantity;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id", referencedColumnName = "id")
//    private Category category;
//
//    private boolean isdelete;
//
//    @OneToMany(mappedBy = "product")
//    private Set<OrderDetail> orderDetails;
//
//    // constructors, getters and setters
//}
