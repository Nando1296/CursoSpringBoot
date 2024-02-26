package com.infsis.ProyectoCursoSpringBoot.Services;

import com.infsis.ProyectoCursoSpringBoot.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogByID(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void delete(Integer blogId);
}
