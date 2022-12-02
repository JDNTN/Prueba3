package com.prueba.exp.exp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.exp.exp.Model.Categoria;

@Repository
public interface ICategoryRepository extends JpaRepository<Categoria, Long>{
    
    /*@Query("SELECT DISTINCT c.Nombre FROM Categoria c Inner Join Producto p ON p.categoria.CodigoCategoria = c.CodigoCategoria INNER JOIN Venta v ON v.producto.CodigoProducto = p.CodigoProducto WHERE YEAR(v.Fecha) = 2019")
	List<Categoria> findCategoriaVentas();*/

}
