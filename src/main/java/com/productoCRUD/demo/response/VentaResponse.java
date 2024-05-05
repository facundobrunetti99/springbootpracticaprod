package com.productoCRUD.demo.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class VentaResponse {

    private Long idVenta;
    private String descpVenta;
    private Date fechaVenta;

    public VentaResponse(Long idVenta, String descpVenta, Date fechaVenta) {
        this.idVenta = idVenta;
        this.descpVenta = descpVenta;
        this.fechaVenta = fechaVenta;
    }
}



