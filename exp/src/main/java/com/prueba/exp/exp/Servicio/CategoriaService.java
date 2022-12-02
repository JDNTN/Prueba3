package com.prueba.exp.exp.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.exp.exp.Model.Categoria;
import com.prueba.exp.exp.Repository.ICategoryRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private ICategoryRepository iCategoryRepository;
    

    public List<Categoria> categoriaAño(){
        return null;
        //return iCategoryRepository.findCategoriaVentas();
    }
}
