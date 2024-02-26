package com.infsis.ProyectoCursoSpringBoot.Services;

import com.infsis.ProyectoCursoSpringBoot.DTOs.ArticleDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.Article;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> getArticleByID(Integer articleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId,ArticleDTO articleDTO);
    void delete(Integer articleId);
}
