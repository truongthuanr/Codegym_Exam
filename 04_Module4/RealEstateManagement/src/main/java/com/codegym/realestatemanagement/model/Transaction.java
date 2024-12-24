package com.codegym.realestatemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "transaction")
@Data
public class Transaction{


    private Long id;
    private Customer customer;
    private Date date;
    private Long servicetype;
    private double price;
    private double area;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CustomerId", nullable = false, //
            foreignKey = @ForeignKey(name = "TRANS_CUS_FK"))
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {this.customer = customer;}

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public Long getServicetype() { return servicetype; }
    public void setServicetype(Long servicetype) { this.servicetype = servicetype; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

}