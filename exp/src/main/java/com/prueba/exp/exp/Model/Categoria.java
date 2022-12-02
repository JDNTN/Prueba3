package com.prueba.exp.exp.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
@Table(name = "Categoria")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoCategoria;
    
    @NotBlank
    private String nombre;

   /* @ManyToOne
    @JoinColumn (name="CodigoProducto")
    private List<Producto> producto;*/
}
