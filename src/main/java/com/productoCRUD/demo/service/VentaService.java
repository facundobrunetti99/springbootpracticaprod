package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Cliente;
import com.productoCRUD.demo.models.Venta;
import com.productoCRUD.demo.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VentaService implements IVentaService{
    private VentaRepository ventarepo;

    @Override
    public Venta addVenta(Long idVenta, String descpventa, Date fechaVenta){
        Venta venta=new Venta();
        venta.setFechaVenta(fechaVenta);
        venta.setIdVenta(idVenta);
        venta.setDescpVenta(descpventa);
        return ventarepo.save(venta);
    }

    @Override
    public List<String> getNameClientes() {
        return null;
    }
}
