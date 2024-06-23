package com.book.my.show.yash.entity;

import lombok.*;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class MovieAttribute {
    Map<String, String> attributes = new HashMap<>();
}
