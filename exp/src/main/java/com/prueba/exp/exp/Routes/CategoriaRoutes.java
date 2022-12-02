package com.prueba.exp.exp.Routes;

import com.prueba.exp.exp.Model.Categoria;
import com.prueba.exp.exp.Servicio.CategoriaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaRoutes {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categoria")
    public List<Categoria> Categoria(){
        return categoriaService.categoriaAño();
    }
}
