package com.infsis.ProyectoCursoSpringBoot.Repositories;

import com.infsis.ProyectoCursoSpringBoot.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer > {

}
