package com.infsis.ProyectoCursoSpringBoot.Services.Implement;

import com.infsis.ProyectoCursoSpringBoot.DTOs.BlogDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.Blog;
import com.infsis.ProyectoCursoSpringBoot.Services.BlogService;

import java.util.Optional;

public class BlogServiceImpl implements BlogService {
    @Override
    public Optional<BlogDTO> getBlogByID(Integer blogId) {
        return Optional.empty();
    }

    @Override
    public BlogDTO saveBlog(BlogDTO blogDTO) {
        return null;
    }

    @Override
    public BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO) {
        return null;
    }

    @Override
    public void delete(Integer blogId) {

    }

    private BlogDTO BlogtoDTO(Blog blog){
        BlogDTO blogDTO = new BlogDTO(
                blog.getId(),
                blog.getName()
        );

        return blogDTO;
    }

    private Blog DTOtoBlog(BlogDTO blogDTO){
        Blog blog = new Blog();
        blog.setId(blogDTO.getId());
        blog.setName(blogDTO.getName());

        return blog;
    }
}
