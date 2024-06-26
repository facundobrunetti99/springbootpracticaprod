package com.productoCRUD.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name = "venta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    private String descpVenta;
    private Date fechaVenta;
    @OneToOne(fetch = FetchType.EAGER,cascade =CascadeType.ALL )
    private Cliente cliente;
    @OneToMany(mappedBy ="venta" ,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Producto> productos = new ArrayList<>();
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "venta")
    private Ticket ticket;


}
