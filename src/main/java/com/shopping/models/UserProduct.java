package com.shopping.models;

import javax.persistence.*;

@Entity
@Table(name="user_product")
public class UserProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private long quantity;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn (name = "product_id")
    private Product product;

    public UserProduct() {}
    public UserProduct(long quantity, User user, Product product) {
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }
    public UserProduct(UserProduct userProduct) {
        this.id = userProduct.id;
        this.quantity = userProduct.quantity;
        this.user = userProduct.user;
        this.product = userProduct.product;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}