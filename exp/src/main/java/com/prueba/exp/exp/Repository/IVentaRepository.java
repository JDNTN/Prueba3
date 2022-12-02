package com.prueba.exp.exp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.exp.exp.Model.Venta;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long>{
    
}
