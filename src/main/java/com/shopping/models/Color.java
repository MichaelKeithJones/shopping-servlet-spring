package com.shopping.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="colors")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "color")
    private List<Product> products;

    public Color() {}
    public Color(String name) {
        this.name = name;
    }
    public Color(Color color) {
        this.id = color.id;
        this.name = color.name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}