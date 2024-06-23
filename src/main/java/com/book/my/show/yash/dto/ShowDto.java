package com.book.my.show.yash.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShowDto {

    Long id;

    @NotNull
    String showName;

    List<Long> seatIds;


    Long movieId;

    String movieName;

    Long screenId;

    String screenName;
    //other metadata
    LocalDateTime startTime;

    LocalDateTime endTime;

    Long movieLength;

    String weekDay;


}
