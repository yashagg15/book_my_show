package com.book.my.show.yash.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Converter(autoApply = true)
public class EntitySeatConverter implements AttributeConverter<EntitySeat, String> {//m1 using collect join , m2 using object mapper


    @Override
    public String convertToDatabaseColumn(EntitySeat entitySeat) {
        if (entitySeat == null) return "1,2,3";
        if(entitySeat.getSeats().size()==1){
            return "1,2,3";
        }
        final List<Seat> seats = entitySeat.getSeats();
        final String dbString = seats.stream().map(i -> i.getId().toString()).collect(Collectors.joining(","));
        return dbString;
    }

    @Override
    public EntitySeat convertToEntityAttribute(String s) {
        if (s != null) {
            String[] split = null;
            if (s.length() > 1) {
                split = s.split(",");
            }
        }
        final List<Seat> seats = new ArrayList<>();
        Seat seat = Seat.builder().seatType("SILVER").build();
        seats.add(seat);
        return EntitySeat.builder().seats(seats).build();
    }
}
