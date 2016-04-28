package com.kz.person.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@Entity
@Table(name="Category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "category_Id")
    private Long categoryId;
    @Column(name = "category_title")
    private String categoriTitle;
    @Column(name = "category_description")
    private String categoryDescription;
    @JsonManagedReference
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    List<Address> addresses = new ArrayList<>();

    public Category() {
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoriTitle() {
        return categoriTitle;
    }

    public void setCategoriTitle(String categoriTitle) {
        this.categoriTitle = categoriTitle;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
