package com.shopping.models;

import javax.persistence.*;

@Entity
@Table(name="item_category")
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public ItemCategory() {}
    public ItemCategory(Item item, Category category) {
        this.item = item;
        this.category = category;
    }
    public ItemCategory(ItemCategory itemCategory) {
        this.id = itemCategory.id;
        this.item = itemCategory.item;
        this.category = itemCategory.category;
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

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
