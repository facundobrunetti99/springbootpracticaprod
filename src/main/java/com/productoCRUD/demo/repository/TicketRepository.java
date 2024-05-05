package com.productoCRUD.demo.repository;

import com.productoCRUD.demo.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {

    @Query("SELECT DISTINCT v.nameprd FROM Venta.productos v")
    List<String> findDistinctnameprd();

    @Query("SELECT DISTINCT v.nameCliente FROM Venta.cliente v")
    List<String> findDistinctClienteName();

}
