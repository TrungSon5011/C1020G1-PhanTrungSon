package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
//                    property = "CategoryId")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer CategoryId;
    private String name;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
//    @JsonManagedReference
//    @JsonBackReference

    private List<Blog>blogs;

    public Category() {
    }

    public Category(Integer categoryId, String name) {
        CategoryId = categoryId;
        this.name = name;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
