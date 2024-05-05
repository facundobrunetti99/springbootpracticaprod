package com.productoCRUD.demo.repository;


import com.productoCRUD.demo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    @Query("SELECT DISTINCT c.nameCliente FROM Cliente c")
    List<String> getAllNameClientes();
}
