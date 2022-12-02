package com.prueba.exp.exp.Routes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.exp.exp.Model.Producto;
import com.prueba.exp.exp.Servicio.ProductoService;

@RestController
public class ProductoRoutes {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/producto/{id}")
    public List<Producto> productos(@PathVariable ("id") Long id){
        return productoService.productoCategoria(id);
    }
}
