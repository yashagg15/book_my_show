package com.book.my.show.yash.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;


@Getter
@Setter
@NoArgsConstructor
@ToString(exclude = {"user", "show", "seats"})
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tickets")
public class Ticket extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 46L;

    @ManyToOne
    @JoinColumn(name="user_id",nullable = true)
    User user;

    @OneToOne
    Show show;

    @OneToOne(fetch = FetchType.EAGER)
    Movie movie;

    //	@OneToMany(fetch = FetchType.EAGER)//fetch all
//	List<Seat> seats = new ArrayList<>();
    String seatIds;

    //not working
    @Convert(converter = EntitySeatConverter.class)
    EntitySeat entitySeat;

    String paymentMod;

    //other metadata


    @Override
    @JsonProperty
    public Long getId() {
        return super.getId();
    }

    // mapping internal value to show in json response
    @JsonProperty
    public String getShowName() {
          return show.getShowName();
    }

    @JsonProperty
    public LocalDateTime getStartTime() {
        final LocalDateTime startTime = show.getStartTime();
        return startTime;
    }

    @JsonProperty
    public LocalDateTime getEndTime() {
        final LocalDateTime endTime = show.getEndTime();
        return endTime;
    }
    @JsonProperty
    public Long getMovieLength() {
        return show.getMovieLength();
    }

    @JsonProperty
    public Optional<Movie> getMovieName() {
        return Optional.of(show.getMovies());
    }

    @JsonProperty
    public String getUserName() {
        return user.getName();
    }
}

