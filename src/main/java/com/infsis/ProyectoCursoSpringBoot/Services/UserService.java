package com.infsis.ProyectoCursoSpringBoot.Services;

import com.infsis.ProyectoCursoSpringBoot.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {
    Optional<UserDTO> getUserByID(Integer userId);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userID);
}
