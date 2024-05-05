package com.productoCRUD.demo.repository;

import com.productoCRUD.demo.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    @Query("SELECT DISTINCT p.nameprd FROM Venta v JOIN v.productos p")
    List<String> findDistinctnameprd();

    @Query("SELECT DISTINCT c.nameCliente FROM Venta v JOIN v.cliente c")
    List<String> findDistinctClienteName();

}
