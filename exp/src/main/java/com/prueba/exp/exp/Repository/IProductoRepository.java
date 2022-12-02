package com.prueba.exp.exp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.exp.exp.Model.Categoria;
import com.prueba.exp.exp.Model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long>{
    
    /*@Query("SELECT DISTINCT p.Nombre FROM Producto p INNER JOIN Categoria c ON p.CodigoCategoria = c.CodigoCategoria INNER JOIN Venta v ON v.CodigoProducto = p.CodigoProducto WHERE c.CodigoCategoria = ?1")
	List<Producto> findProductosCategoria(Long id);*/

}
