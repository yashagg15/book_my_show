package com.book.my.show.yash.entity;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EntitySeat implements Serializable {
    List<Seat> seats = new ArrayList<>();
}
