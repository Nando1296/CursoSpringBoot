package com.infsis.ProyectoCursoSpringBoot.DTOs;

import java.time.LocalDateTime;

public class BlogDTO {
    private Integer id;
    private String name;

    public BlogDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public BlogDTO() {
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
