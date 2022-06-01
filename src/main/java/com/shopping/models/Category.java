package com.shopping.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 255)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<ItemCategory> item_category;

    public Category() {}
    public Category(String name) {
        this.name = name;
    }
    public Category(Category category) {
        this.id = category.id;
        this.name = category.name;
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
}