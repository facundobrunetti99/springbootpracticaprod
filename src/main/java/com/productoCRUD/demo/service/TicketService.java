package com.productoCRUD.demo.service;

import com.productoCRUD.demo.models.Ticket;
import com.productoCRUD.demo.repository.TicketRepository;
import org.hibernate.cache.internal.TimestampsCacheEnabledImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService implements ITicketService{
    @Autowired
    private TicketRepository ticketRepo;
    @Override
    public Ticket addTicket(Long idTicket) {
        Ticket ticket=new Ticket();
        ticket.setIdTicket(idTicket);
        return ticketRepo.save(ticket);
    }

    @Override
    public List<String> getAllNameProducts() {
        return ticketRepo.findDistinctnameprd();
    }
    @Override
    public List<String> getAllClienteName(){
        return ticketRepo.findDistinctClienteName();
    }


}
