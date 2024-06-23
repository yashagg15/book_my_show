package com.book.my.show.yash.dto;

import lombok.*;

import java.util.List;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

    Object dataObject;

    List<?> datalist;

    String responseTime;

    String errorMessage;

}
