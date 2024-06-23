package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.SeatDao;
import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.Seat;
import com.book.my.show.yash.entity.SeatLock;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Getter
@Service
@Slf4j
public class SeatsService extends BaseService<Seat> {

    final SeatDao seatDao;
    final SeatLockDao seatLockDao;


    public SeatsService(SeatDao seatDao, SeatLockDao seatLockDao) {
        super(seatDao);
        this.seatDao = seatDao;
        this.seatLockDao = seatLockDao;
    }


    /**
     * 1 save seat
     * 2 save seat lock
     * 3 add @transaction if any one fail then rollback
     */
    @Transactional
    public void saveSeatAndLock(Long showId, Seat seat) {
        seatDao.save(seat);
        log.info("seat = {}", seat);
        saveSeatLock(showId, seat);
    }

    @Transactional //method level
    public void saveSeatLock(Long showId, Seat seat) {
        final SeatLock seatLock = SeatLock.builder()
                .showId(showId)
                .seatId(seat.getId())
                .lockStatus("available")
//                .lockedTime(LocalDateTime.now())
//                .timeoutInSec(Long.valueOf(10))
//                .timeOutDuration(Duration.ofSeconds(10))
                .build();
        seatLockDao.save(seatLock);
        log.info("seatLock = {}",seatLock);

        //not working @Txn
//        if (true) {
//            throw new RuntimeException("query failed : sample exception");
//        }
    }
}
