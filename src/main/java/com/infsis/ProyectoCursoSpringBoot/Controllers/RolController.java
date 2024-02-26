package com.infsis.ProyectoCursoSpringBoot.Controllers;

import com.infsis.ProyectoCursoSpringBoot.DTOs.RolDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rol")
public class RolController {

    @GetMapping()
    public ResponseEntity<RolDTO> getRols(){
        RolDTO rolDTO = new RolDTO(1, "name");
        return ResponseEntity.ok().body(rolDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RolDTO> getRol(@PathVariable Integer id){
        RolDTO rolDTO = new RolDTO(1, "name");
        return ResponseEntity.ok().body(rolDTO);
    }

    @PostMapping()
    public ResponseEntity<RolDTO> saveRol(@RequestBody RolDTO rolDTO){
        return ResponseEntity.ok().body(rolDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RolDTO> updateRol(@PathVariable Integer id, @RequestBody RolDTO rolDTO){
        return ResponseEntity.ok().body(rolDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Integer id){

    }
}
