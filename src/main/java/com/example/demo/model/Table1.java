package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Table1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data;
    //private String address;

    public Table1() {
    }

    public Table1(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    //public String getAddress() {
    	//return address;
   // }
    //public void setAddress(String address) {
    	//this.address= address;
    //}
}