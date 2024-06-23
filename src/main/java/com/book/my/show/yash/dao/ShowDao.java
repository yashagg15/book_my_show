package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.Show;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ShowDao extends BaseDao<Show> {

//    @Query(value = "insert into shows_seats(show_id, seats_id) values(1, 5)",
//    @Query(value = "insert into shows_seats(show_id, seats_id) select :showId, :seatId",
    @Query(value = "insert into shows_seats(show_id, seats_id) values (:showId, :seatId)",
            nativeQuery = true)
    @Modifying //https://thorben-janssen.com/spring-data-jpa-query-annotation/
    void addNewShowSeat(Long showId, Long seatId);//not working
//    void addNewShowSeat(@Param("showId") Long showId, @Param("seatsId") Long seatId);//not working
    //insert into shows_seats(show_id, seats_id) values(1, 5); //working sql


}
