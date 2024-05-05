package com.productoCRUD.demo.response;

import com.productoCRUD.demo.models.Venta;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class TicketResponse {
    private Long idTicket;
    private Venta venta;

    public TicketResponse(Long idTicket, Venta venta) {
        this.idTicket = idTicket;
        this.venta = venta;
    }


}
