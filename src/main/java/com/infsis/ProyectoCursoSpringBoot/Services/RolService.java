package com.infsis.ProyectoCursoSpringBoot.Services;

import com.infsis.ProyectoCursoSpringBoot.DTOs.RolDTO;

import java.util.Optional;

public interface RolService {
    Optional<RolDTO> getRolByID(Integer rolId);
    RolDTO saveRol(RolDTO rolDTO);
    RolDTO updateRol(Integer rolID, RolDTO rolDTO);
    void delete(Integer rolID);
}
