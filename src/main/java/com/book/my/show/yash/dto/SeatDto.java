package com.book.my.show.yash.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeatDto {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    Long id;

    String seatType;
    String seatStatus = "Please call seats specific apis to know seat Status";
    //other metadata GOLD, SILVER
}
