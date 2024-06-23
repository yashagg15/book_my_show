package com.book.my.show.yash.controller;

import com.book.my.show.yash.dto.ResponseDto;
import com.book.my.show.yash.dto.TicketDto;
import com.book.my.show.yash.entity.Seat;
import com.book.my.show.yash.entity.Ticket;
import com.book.my.show.yash.entity.User;
import com.book.my.show.yash.service.SeatsService;
import com.book.my.show.yash.service.TicketService;
import com.book.my.show.yash.service.UserService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/ticket")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Show Booking Tickets API", description = "API for managing booking shows tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Autowired
    SeatsService seatsService;

    @Autowired
    UserService userService;

    public ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/{ticketId}")
    public ResponseEntity<ResponseDto> findATicket(@PathVariable("ticketId") Long id){
        Ticket ticket = ticketService.fetchTicket(id);
        TicketDto ticketDto = new TicketDto();
        ticketDto.setMovie(ticket.getMovie());
        ticketDto.setPaymentMod(ticket.getPaymentMod());
        User user = ticket.getUser();
        ticketDto.setUserId(user.getId());
        ticketDto.setUserName(user.getName());
        ticketDto.setShowId(ticket.getShow().getId());
        ticketDto.setShowName(ticket.getShow().getShowName());
        ticketDto.setShowStartTime(ticket.getShow().getStartTime());
        List<Seat> seats = ticket.getEntitySeat().getSeats();
        ticketDto.setBookedSeats(ticket.getSeatIds());

        return new ResponseEntity<>(ResponseDto.builder().dataObject(ticketDto).build(),
                HttpStatus.OK);

    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<ResponseDto> findAllTickets(@PathVariable("userId") Long id){

        User fetchedUser = userService.findById(id);
        List<Ticket> tickets = fetchedUser.getTickets();
        List<TicketDto> ticketDtos =
                tickets.stream().map(ticket -> {
                    TicketDto ticketDto = new TicketDto();
                    ticketDto.setMovie(ticket.getMovie());
                    ticketDto.setPaymentMod(ticket.getPaymentMod());
                    User user = ticket.getUser();
                    ticketDto.setUserId(user.getId());
                    ticketDto.setUserName(user.getName());
                    ticketDto.setShowId(ticket.getShow().getId());
                    ticketDto.setShowName(ticket.getShow().getShowName());
                    ticketDto.setShowStartTime(ticket.getShow().getStartTime());
                    List<Seat> seats = ticket.getEntitySeat().getSeats();
                    ticketDto.setBookedSeats(ticket.getSeatIds());
                    return ticketDto;
                }).collect(Collectors.toList());

        return new ResponseEntity<>(ResponseDto.builder().datalist(ticketDtos).build(),
                HttpStatus.OK);

    }
}
