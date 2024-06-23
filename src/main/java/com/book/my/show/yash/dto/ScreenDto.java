package com.book.my.show.yash.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScreenDto {

    Long id;

    String screenName;

    String theatreName;

}
