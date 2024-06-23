package com.book.my.show.yash.entity;

import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Event {
    String name;
    String type;
    Map<String, Object> params = new HashMap<>();
    LocalDateTime localDateTime;
}
