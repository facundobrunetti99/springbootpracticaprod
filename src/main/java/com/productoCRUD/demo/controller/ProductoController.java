package com.productoCRUD.demo.controller;

import com.productoCRUD.demo.models.Producto;
import com.productoCRUD.demo.response.ProductoResponse;
import com.productoCRUD.demo.service.IProductoService;
import com.productoCRUD.demo.service.ITicketService;
import com.productoCRUD.demo.service.TicketService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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

        ProductoResponse response= new ProductoResponse(guardarProducto.getIdprd(),
                guardarProducto.getNameprd(),guardarProducto.getPriceprd(), guardarProducto.getStockprd());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/show/prod")
    public List <String> showProductName(){
            return prodservice.getNameProducts();
    }

    @DeleteMapping("/delete/prod")
    public String DeleteProduct(@RequestParam("idprod") Long idprd){
       return prodservice.deleteProductDB(idprd);

    }

    @GetMapping("/show/prod/delete-search")
    public List<Producto> searchProd(@RequestParam String name) {
        return prodservice.findAllSearchProductos(name);
    }

    
}
