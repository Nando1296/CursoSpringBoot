package com.infsis.ProyectoCursoSpringBoot.Services.Implement;

import com.infsis.ProyectoCursoSpringBoot.DTOs.ArticleDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.Article;
import com.infsis.ProyectoCursoSpringBoot.Services.ArticleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Override
    public Optional<ArticleDTO> getArticleByID(Integer articleId) {
        return Optional.empty();
    }

    @Override
    public ArticleDTO saveArticle(ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO) {
        return null;
    }

    @Override
    public void delete(Integer articleId) {

    }

    private ArticleDTO ArticletoDTO(Article article){
        ArticleDTO articleDTO = new ArticleDTO(
                article.getId(),
                article.getTitle(),
                article.getReference()
        );
        return articleDTO;
    }
    private Article DTOtoArticle(ArticleDTO articleDTO){
        Article article = new Article();
        article.setId(articleDTO.getId());
        article.setTitle(articleDTO.getTitle());
        article.setReference(articleDTO.getReference());

        return article;
    }
}
