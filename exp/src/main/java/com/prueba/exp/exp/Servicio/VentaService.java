package com.prueba.exp.exp.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.exp.exp.Repository.IVentaRepository;

@Service
public class VentaService {
    
    @Autowired
    private IVentaRepository iVentaRepository;

}
