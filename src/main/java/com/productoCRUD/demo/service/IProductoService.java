package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Producto;
import lombok.NoArgsConstructor;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductoService {

    Producto addProductoDB(String nameprd,double priceprd, int stockprd);
    String deleteProductDB(Long idprd);
    List<String> getNameProducts();
    List<Producto> findAllSearchProductos(String name);
    List<Producto> getProducts();
    Producto modificarProd(Long id, String name);

}
