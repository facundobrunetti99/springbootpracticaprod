package com.productoCRUD.demo.controller;

import com.productoCRUD.demo.models.Producto;
import com.productoCRUD.demo.response.ProductoResponse;
import com.productoCRUD.demo.service.IProductoService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

@RequestMapping("/productos")
public class ProductoController {
    public final IProductoService prodservice;

    @PostMapping("/add/new-prod")
    public ResponseEntity<ProductoResponse> addProducto(
                @RequestParam("nameprod") String nameprd,
                @RequestParam("priceprod") double priceprd,
                @RequestParam("stockprod") int stockprd

    ){
        Producto guardarProducto=prodservice.addProductoDB(nameprd,priceprd,stockprd);
        ProductoResponse response= new ProductoResponse(guardarProducto.getIdprd(),guardarProducto.getNameprd(),guardarProducto.getPriceprd(), guardarProducto.getStockprd());
        return ResponseEntity.ok(response);
    }
}
