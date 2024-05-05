package com.productoCRUD.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.SpringVersion;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTicket;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Venta venta;


    // Método para mostrar información del ticket
    public String mostrarTicket() {
        String id = "ID del Ticket: " + getIdTicket();
        String descVenta = "Descripción de la Venta: " + venta.getDescpVenta();
        String fechaVenta = "Fecha de la Venta: " + venta.getFechaVenta();
        String nombreCliente = "Nombre del Cliente: " + venta.getCliente().getNameCliente();
        String dniCliente = "DNI del Cliente: " + venta.getCliente().getDniCliente();
        return String.join("\n", id, descVenta, fechaVenta, nombreCliente, dniCliente);
    }
}


