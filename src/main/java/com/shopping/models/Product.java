package com.shopping.models;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn (name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn (name = "color_id")
    private Color color;

    @Column(nullable = false, precision = 2, scale = 4)
    private double height;

    @Column(nullable = false, precision = 2, scale = 4)
    private double width;

    @Column(nullable = false, precision = 2, scale = 4)
    private double length;

    @Column(nullable = false, length = 8)
    private String dimension_unit;

    @Column(nullable = false, precision = 2, scale = 4)
    private double weight;

    @Column(nullable = false, length = 8)
    private String weight_unit;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false, precision = 2, scale = 4)
    private double cost;

    @OneToMany(mappedBy = "product")
    private List<UserProduct> user_product;

    public Product() {}
    public Product(Item item, Color color, double height, double width, double length, String dimension_unit, double weight, String weight_unit, String description, double cost, List<UserProduct> user_product) {
        this.item = item;
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
        this.dimension_unit = dimension_unit;
        this.weight = weight;
        this.weight_unit = weight_unit;
        this.description = description;
        this.cost = cost;
        this.user_product = user_product;
    }
    public Product(Product product) {
        this.item = product.item;
        this.color = product.color;
        this.height = product.height;
        this.width = product.width;
        this.length = product.length;
        this.dimension_unit = product.dimension_unit;
        this.weight = product.weight;
        this.weight_unit = product.weight_unit;
        this.description = product.description;
        this.cost = product.cost;
        this.user_product = product.user_product;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String getDimension_unit() {
        return dimension_unit;
    }
    public void setDimension_unit(String dimension_unit) {
        this.dimension_unit = dimension_unit;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }
    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<UserProduct> getUser_product() {
        return user_product;
    }
    public void setUser_product(List<UserProduct> user_product) {
        this.user_product = user_product;
    }
}