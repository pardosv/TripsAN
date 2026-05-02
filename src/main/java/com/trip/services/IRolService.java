package com.trip.services;



import java.util.List;

import com.trip.models.Rol;

public interface IRolService {

    List<Rol> listarRoles();

    Rol buscarPorId(Long id);
}