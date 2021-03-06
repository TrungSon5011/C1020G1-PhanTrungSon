package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Province {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "province_id")
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private List<Customer> customers;

    public Province() {
    }

    public Province(Integer id, String name, List<Customer> customers) {
        this.id = id;
        this.name = name;
        this.customers = customers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
