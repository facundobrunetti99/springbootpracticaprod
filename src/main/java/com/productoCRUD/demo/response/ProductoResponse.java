package com.productoCRUD.demo.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductoResponse {
    private Long idprd;
    private String nameprd;
    private double priceprd;
    private int stockprd;

    public ProductoResponse(Long idprd, String nameprd, double priceprd, int stockprd) {
        this.idprd = idprd;
        this.nameprd = nameprd;
        this.priceprd = priceprd;
        this.stockprd = stockprd;
    }
}
