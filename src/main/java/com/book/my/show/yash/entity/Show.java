package com.book.my.show.yash.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"seats", "movies"}, callSuper = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "shows")
public class Show extends BaseEntity implements Serializable {


    private static final long serialVersionUID = 62L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String showName;

    @ManyToMany(fetch = FetchType.EAGER)//+ 1 dao method
    List<Seat> seats = new ArrayList<>();

    @OneToOne
    Movie movies;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="screen_id",nullable = true)
    @JsonManagedReference
    Screen screen;

    //other metadata
    LocalDateTime startTime; //only LocalTime is enough here , TODO
    LocalDateTime endTime;
    Long movieLength;//start - end time

    @Convert(converter = WeekDayConvert.class)
    WeekDay weekDay;//this is simple pojo and inside that also simple pojo list


    @Transient
    List<Days> days = new ArrayList<>();
    public List<Days> getDays() {// in weekday enum we are showing values
        return weekDay.getDays();
    }

//    @JsonProperty(value = "seat_types")
//    public Map<String, List<Long>> getSeatsTypes() {
//        final Map<String, List<Long>> collect = seats.stream().collect(Collectors.groupingBy(
//                i -> i.getSeatType(),
//                Collectors.mapping(i -> i.getSeatId(), Collectors.toList())
//        ));
//        return collect;
//    }

    @JsonProperty
    public Movie getMovieNames() {
        return movies;
    }

}
