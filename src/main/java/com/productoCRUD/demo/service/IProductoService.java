package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Producto;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IProductoService {

    Producto addProductoDB(String nameprd,double priceprd, int stockprd);
    List<String> getNameProducts();

}
