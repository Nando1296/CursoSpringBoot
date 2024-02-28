package com.infsis.ProyectoCursoSpringBoot.Services.Implement;

import com.infsis.ProyectoCursoSpringBoot.DTOs.UserDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.User;
import com.infsis.ProyectoCursoSpringBoot.Repositories.UserRepository;
import com.infsis.ProyectoCursoSpringBoot.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getUsers(){
        return userRepository.findAll()
                .stream()
                .map(this::UsertoDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserByID(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            new IllegalArgumentException("Invalid ID");
        }
        return UsertoDTO(userOptional.get());
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return UsertoDTO(userRepository.save(DTOtoUser(userDTO)));
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        if(userId != userDTO.getId()){
            new IllegalArgumentException("Invalid ID");
        }
        Optional<User> userOptional = userRepository.findById(userDTO.getId());

        if(userOptional.isEmpty()){
            new IllegalArgumentException("Invalid ID");
        }

        User user = userOptional.get();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return UsertoDTO(userRepository.save(user));
    }

    @Override
    public void delete(Integer userID) {
        userRepository.deleteById(userID);
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
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
