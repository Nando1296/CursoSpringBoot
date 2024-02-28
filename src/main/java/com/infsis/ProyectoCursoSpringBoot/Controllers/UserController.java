package com.infsis.ProyectoCursoSpringBoot.Controllers;

import com.infsis.ProyectoCursoSpringBoot.DTOs.UserDTO;
import com.infsis.ProyectoCursoSpringBoot.Services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<UserDTO>> getUsers(){
        UserDTO userDTO = new UserDTO(1, "users", "users@users");
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        UserDTO userDTO = new UserDTO(1, "user", "user@user");
        return ResponseEntity.ok().body(userService.getUserByID(id));
    }

    @PostMapping()
    public ResponseEntity<UserDTO> saveUser(@Valid @RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userService.saveUser(userDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userService.updateUser(id, userDTO));
    }

    @DeleteMapping
    public void deleteUser(@PathVariable Integer id){

    }
}
