package com.book.my.show.yash.dto;

import com.book.my.show.yash.entity.Movie;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    Long userId;

    String userName;

    Long showId;

    String showName;

    LocalDateTime showStartTime;

    Movie movie;

    // separated by :
    String bookedSeats;

    String paymentMod;

}
