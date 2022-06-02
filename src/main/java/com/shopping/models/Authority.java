package com.shopping.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 32)
    private String name;

    @OneToMany(mappedBy = "authority")
    private List<UserAuthority> user_authority;

    public Authority() {}
    public Authority(long id, String name, List<UserAuthority> user_authority) {
        this.name = name;
        this.user_authority = user_authority;
    }
    public Authority(Authority authority) {
        this.id = authority.id;
        this.name = authority.name;
        this.user_authority = authority.user_authority;
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

    public List<UserAuthority> getUser_authority() {
        return user_authority;
    }
    public void setUser_authority(List<UserAuthority> user_authority) {
        this.user_authority = user_authority;
    }
}
