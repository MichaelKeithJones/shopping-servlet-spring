package com.shopping.models;

import javax.persistence.*;

@Entity
@Table(name="user_authority", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "authority_id"}))
public class UserAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "authority_id")
    private Authority authority;

    public UserAuthority() {}
    public UserAuthority(Item item, Category category) {
        this.user = user;
        this.authority = authority;
    }
    public UserAuthority(UserAuthority userAuthority) {
        this.id = userAuthority.id;
        this.user = userAuthority.user;
        this.authority = userAuthority.authority;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Authority getAuthority() {
        return authority;
    }
    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}
