package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Ticket;

import java.util.List;

public interface ITicketService {

     Ticket addTicket(Long idTicket);

    List<String> getAllNameProducts();
}
