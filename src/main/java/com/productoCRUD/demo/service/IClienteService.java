package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Cliente;

import java.util.List;

public interface IClienteService {

        Cliente addCliente(int dniCLiente, String nameCliente);
        List<String> getNameClientes();
}
