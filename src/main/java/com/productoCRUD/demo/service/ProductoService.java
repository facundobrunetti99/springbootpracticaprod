package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Producto;
import com.productoCRUD.demo.repository.ProductoRepository;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@Service
public class ProductoService implements  IProductoService{
/*Aca vamos a crear la logica necesaria para poder cargar los datos a la base de datos */
    @Autowired
    private  ProductoRepository prdrepo;

    @SneakyThrows
    @Override
    public Producto addProductoDB( String nameprd, double priceprd, int stockprd) {
        Producto producto=new Producto();
        producto.setPriceprd(priceprd);
        producto.setNameprd(nameprd);
        producto.setStockprd(stockprd);
        
        return prdrepo.save(producto);
    }

    @Override
    public List<String> getNameProducts() {
        return prdrepo.findDistinctnameprd();
    }

    @Override
    public String deleteProductDB(Long idprd) {
      
        Optional<Producto> productoBD = prdrepo.findById(idprd);
        Producto deleteProducto = productoBD.get();
        prdrepo.delete(deleteProducto);
        return "Producto Eliminado con exito";
       

    }

    @Override
    public List<Producto> findAllSearchProductos(String name) {
        return prdrepo.findAllSearchProductos(name);
    }


    
}
