package com.prueba.exp.exp.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Entity
@Data
@Table(name = "Venta")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CodigoVenta;
    
    @NotBlank
    private Date Fecha;

    @ManyToOne
    @JoinColumn (name="CodigoProducto")
    private Producto producto;
}
