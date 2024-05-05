package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Cliente;
import com.productoCRUD.demo.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{
    private ClienteRepository clienterepo;
    @Override
    public Cliente addCliente( int dniCLiente, String nameCliente) {
        Cliente cliente =new Cliente();

        cliente.setNameCliente(nameCliente);
        cliente.setDniCliente(dniCLiente);

        return clienterepo.save(cliente);
    }

    @Override
    public List<String> getNameClientes() {
        return clienterepo.getAllNameClientes();
    }
}
