package com.infsis.ProyectoCursoSpringBoot.Services;

import com.infsis.ProyectoCursoSpringBoot.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO getUserByID(Integer userId);
    List<UserDTO> getUsers();
    UserDTO saveUser(UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userID);
}
