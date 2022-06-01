package com.shopping.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<Product> products;

    @OneToMany(mappedBy = "item")
    private List<ItemCategory> item_category;

    public Item() {}
    public Item(String name) {
        this.name = name;
    }
    public Item(Item item) {
        this.id = item.id;
        this.name = item.name;
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

    public List<ItemCategory> getItem_category() {
        return item_category;
    }
    public void setItem_category(List<ItemCategory> item_category) {
        this.item_category = item_category;
    }
}