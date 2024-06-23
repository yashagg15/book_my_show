package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.SeatLock;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SeatLockDao extends BaseDao<SeatLock> {
    SeatLock findByShowIdAndSeatId(Long showId, Long seatId);
    SeatLock findByShowIdAndSeatIdAndLockStatus(Long showId, Long seatId, String lockStatus);
    List<SeatLock> findByShowId(Long showId);
}
