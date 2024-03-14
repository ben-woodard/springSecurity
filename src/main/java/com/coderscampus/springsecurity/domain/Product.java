package com.coderscampus.springsecurity.domain;

import java.math.BigDecimal;

public record Product (Integer id,
                       String name,
                       BigDecimal price) {

    //Commented below out because we changed this to a RECORD NOT A CLASS

//    private Integer id;
//    private String name;
//    private BigDecimal price;
//
//    public Product(Integer id, String name, BigDecimal price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
}
