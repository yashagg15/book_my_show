package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.SeatLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class SeatLockService extends BaseService<SeatLock> {

    public SeatLockService(BaseDao<SeatLock> dao) {
        super(dao);
    }

    @Autowired
    SeatLockDao seatLockDao;

    Map<Long,SeatLock> seatIdVsSeatLock;

//    @Cacheable(value = "seat_lock_list", key = "#showId")
//    public Map<Long,SeatLock> findAllSeatLockByShow(Long showId){
//        seatIdVsSeatLock = new HashMap<>();
//        List<SeatLock> seatLock = seatLockDao.findByShowId(showId);
//        seatLock.stream().map(seatLock1 -> s)
//        return seatLock;
//    }
}
