package com.calazans_shop.CalazansShop.main.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio")
    private Double price;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "foto")
    private String photo;

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
