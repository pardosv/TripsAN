package com.trip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.trip.services.IRolService;

	@Controller
	@RequestMapping("/roles")
	public class RolController {

	    @Autowired
	    private IRolService rolService;

	    @GetMapping
	    public String listarRoles(Model model) {
	        model.addAttribute("roles", rolService.listarRoles());
	        return "roles"; // vista
	    }

	    @GetMapping("/{id}")
	    public String verRol(@PathVariable Long id, Model model) {
	        model.addAttribute("rol", rolService.buscarPorId(id));
	        return "detalleRol";
	    }
	}

