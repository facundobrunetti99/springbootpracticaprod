package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Venta;

import java.util.Date;
import java.util.List;

public interface IVentaService {
    Venta addVenta(Long idVenta, String descpventa, Date fechaVenta);

    List<String> getNameClientes();

}
