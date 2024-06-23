package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.Seat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SeatDao extends BaseDao<Seat> {

	@Query(value = "select * from seats where id in (select seat_id from seat_lock where show_id = :showId and lock_status = 'available')",
			nativeQuery = true)
    List<Seat> findAllAvailableShowSeats(Long showId);
}
