package com.shopping.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 32)
    private String username;

    @Column(nullable = false, unique = true, length = 128)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String profile_image_url;

    @OneToMany(mappedBy = "user")
    private List<UserProduct> user_product;

    public User() {}
    public User(String username, String email, String password, String profile_image_url, List<UserProduct> user_product) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.profile_image_url = profile_image_url;
        this.user_product = user_product;
    }
    public User(User user) {
        this.id = user.id;
        this.username = user.username;
        this.email = user.email;
        this.password = user.password;
        this.profile_image_url = user.profile_image_url;
        this.user_product = user.user_product;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public List<UserProduct> getUser_product() {
        return user_product;
    }
    public void setUser_product(List<UserProduct> user_product) {
        this.user_product = user_product;
    }
}
