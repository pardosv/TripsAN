package com.trip.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trip.models.Rol;

@Service
public class RolServiceImpl implements IRolService {

    List<Rol> lista = null;

    public RolServiceImpl() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        lista = new LinkedList<Rol>();

        try {
            Rol rol1 = new Rol();
            rol1.setId(1L);
            rol1.setNombre("Administrador");
            rol1.setDescripcion("Control total del sistema");
            rol1.setEstado(true);
            rol1.setFechaCreacion(sdf.parse("01-01-2024"));

            Rol rol2 = new Rol();
            rol2.setId(2L);
            rol2.setNombre("Vendedor");
            rol2.setDescripcion("Encargado de ventas");
            rol2.setEstado(true);
            rol2.setFechaCreacion(sdf.parse("05-02-2024"));

            Rol rol3 = new Rol();
            rol3.setId(3L);
            rol3.setNombre("Visitante");
            rol3.setDescripcion("Usuario sin permisos");
            rol3.setEstado(false);
            rol3.setFechaCreacion(sdf.parse("10-03-2024"));

            lista.add(rol1);
            lista.add(rol2);
            lista.add(rol3);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Rol> listarRoles() {
        return lista;
    }

    @Override
    public Rol buscarPorId(Long id) {
        for (Rol rol : lista)
            if (rol.getId().equals(id))
                return rol;

        return null;
    }
}