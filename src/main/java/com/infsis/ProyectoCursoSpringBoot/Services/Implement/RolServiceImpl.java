package com.infsis.ProyectoCursoSpringBoot.Services.Implement;

import com.infsis.ProyectoCursoSpringBoot.DTOs.RolDTO;
import com.infsis.ProyectoCursoSpringBoot.Models.Rol;
import com.infsis.ProyectoCursoSpringBoot.Services.RolService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Override
    public Optional<RolDTO> getRolByID(Integer rolId) {
        return Optional.empty();
    }

    @Override
    public RolDTO saveRol(RolDTO rolDTO) {
        return null;
    }

    @Override
    public RolDTO updateRol(Integer rolID, RolDTO rolDTO) {
        return null;
    }

    @Override
    public void delete(Integer rolID) {

    }

    private RolDTO RoltoDTO(Rol rol){
        RolDTO rolDTO = new RolDTO(
                rol.getId(),
                rol.getName()
        );
        return rolDTO;
    }

    private Rol DTOtoRol(RolDTO rolDTO){
        Rol rol = new Rol();
        rol.setId(rolDTO.getId());
        rol.setName(rolDTO.getName());

        return rol;
    }
}
