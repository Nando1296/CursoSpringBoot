package com.infsis.ProyectoCursoSpringBoot.DTOs;

public class RolDTO {
    private Integer id;
    private String name;

    public RolDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public RolDTO() {
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
