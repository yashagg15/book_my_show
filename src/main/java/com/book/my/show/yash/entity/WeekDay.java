package com.book.my.show.yash.entity;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class WeekDay implements Serializable  {
    private static final long serialVersionUID = 490L;
    List<Days> days = new ArrayList<>();//todo test for list of Entity class
}
