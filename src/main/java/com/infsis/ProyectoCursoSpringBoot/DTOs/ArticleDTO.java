package com.infsis.ProyectoCursoSpringBoot.DTOs;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class ArticleDTO {
    private Integer id;
    private String title;
    private String reference;

    public ArticleDTO() {
    }

    public ArticleDTO(Integer id, String title, String reference) {
        this.id = id;
        this.title = title;
        this.reference = reference;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
