package com.prueba.exp.exp.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.exp.exp.Model.Producto;
import com.prueba.exp.exp.Repository.IProductoRepository;


@Service
public class ProductoService {
    
    @Autowired
    private IProductoRepository iProductoRepository;
    

    /*public List<Producto> productoCategoria(Categoria categoria){
        return iProductoRepository.findProductosCategoria(categoria);
    }*/

    public List<Producto> productoCategoria(Long categoria){
        return null;
    }
}
