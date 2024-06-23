package com.book.my.show.yash.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import javax.persistence.AttributeConverter;

public class MovieAttributeConvertor implements AttributeConverter<MovieAttribute, String> {
    ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(MovieAttribute movieAttribute) {
        if (movieAttribute == null) return "";
        return objectMapper.writeValueAsString(movieAttribute);
    }

    @SneakyThrows
    @Override
    public MovieAttribute convertToEntityAttribute(String s) {
        if (s == null || s.equals("")) return new MovieAttribute();
        return objectMapper.readValue(s, MovieAttribute.class);
    }
}
