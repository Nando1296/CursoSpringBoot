package com.infsis.ProyectoCursoSpringBoot.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Rol(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Rol() {

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
}
