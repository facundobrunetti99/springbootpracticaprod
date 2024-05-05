package com.productoCRUD.demo.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
public class ClienteResponse {

    int dniCliente;
    private String nameCliente;
    private Long idCliente;

    public ClienteResponse(Long idCliente, int dniCliente, String nameCliente) {
        this.dniCliente = dniCliente;
        this.nameCliente = nameCliente;
        this.idCliente=idCliente;
    }





}
