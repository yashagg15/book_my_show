package com.book.my.show.yash.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto implements Serializable {

    Long id;

    String movieName;
    //other metadata
    Float ratings;

}
