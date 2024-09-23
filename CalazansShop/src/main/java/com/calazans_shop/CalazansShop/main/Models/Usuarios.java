package com.calazans_shop.CalazansShop.main.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "correo")
    private String mail;

    @Column(name = "contraseña")
    private String password;

    @Column(name = "direccion")
    private String address;

    @Immutable
    @Column(name = "rol")
    private String role;

    @Column(name = "codigo_postal")
    private Integer postalCode;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }
}
