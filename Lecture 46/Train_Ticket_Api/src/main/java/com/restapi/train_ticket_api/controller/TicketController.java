package com.restapi.train_ticket_api.controller;

import com.restapi.train_ticket_api.bindiing.passengerinfo;
import com.restapi.train_ticket_api.bindiing.ticketinfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {
    @GetMapping("ticket/{ticketid}")
    public ResponseEntity<ticketinfo> getTicket(@PathVariable("ticketId") Integer ticketId){
        ticketinfo tinfo=new ticketinfo();

        tinfo.setTicketStatus("Confirmed ");
        tinfo.setTicketId(ticketId);
        tinfo.setPnr("ksnv124");

        return new ResponseEntity<>(tinfo,HttpStatus.OK);
    }


    @PostMapping(value="/ticket", produces={"application/json"} , consumes = {"application/json"})
    public ResponseEntity<ticketinfo> bookticket(@RequestBody passengerinfo request){
        System.out.println(request);
        ticketinfo tinfo=new ticketinfo();
        tinfo.setTicketId(1234);
        tinfo.setPnr("jdksghsdkgd");
        tinfo.setTicketStatus("COnfirmed");

        return new ResponseEntity<>(tinfo, HttpStatus.CREATED);
    }


    @PutMapping("/ticket")
    public ResponseEntity<String> UpdateTicket(@RequestBody passengerinfo request){
        System.out.println(request);

        return new ResponseEntity<>("ticket updated",HttpStatus.OK);
    }

    @DeleteMapping("/ticket/{ticketId}")
    public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId){
        return new ResponseEntity<>("Ticket Deleted",HttpStatus.CREATED);
    }
}
