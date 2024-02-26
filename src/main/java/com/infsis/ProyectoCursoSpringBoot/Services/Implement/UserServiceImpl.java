package com.infsis.ProyectoCursoSpringBoot.Services.Implement;

import com.infsis.ProyectoCursoSpringBoot.DTOs.UserDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.User;
import com.infsis.ProyectoCursoSpringBoot.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<UserDTO> getUserByID(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userID) {

    }

    private UserDTO UsertoDTO(User user){
        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private User DTOtoUser(UserDTO userDTO){
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
