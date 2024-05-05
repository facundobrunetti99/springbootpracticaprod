package com.productoCRUD.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.sql.results.graph.Fetch;

@Entity
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprd;
    private String nameprd;
    private double priceprd;
    private int stockprd;


    @ManyToOne
    @JoinColumn(name = "venta_id_venta")  // Esto especifica la clave foránea
    @JsonIgnore
    private Venta venta;

}
