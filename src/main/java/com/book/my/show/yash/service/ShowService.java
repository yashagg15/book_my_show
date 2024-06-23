package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.SeatLock;
import com.book.my.show.yash.entity.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService extends BaseService<Show> {

    @Autowired
    SeatLockDao seatLockDao;

    public ShowService(BaseDao<Show> showDao) {
        super(showDao);
    }

    //create new entry in lock db table when we are creating new show
    //k1 : showid, key2 : seatid, value lock status, key 1 and key2 relation is 1:M
    @Override
    @CachePut(value = "show",key="#show.id")
    @CacheEvict(value = "shows_list",allEntries = true, beforeInvocation = false)
    public Show save(Show show) {
        final Show show1 = super.save(show);//we will get id generated by JPA
        show1.getSeats().forEach(seat -> {
            final SeatLock seatLock = SeatLock.builder().showId(show.getId())
                    .seatId(seat.getId()).lockStatus("available").build();
            seatLockDao.save(seatLock);
        });
        return show1;
    }

    @Cacheable(value = "shows_list", key="#root.methodName")
    public List<Show> getAllShows(){
        System.out.println("Fetching all shows from db");
        return this.dao.findAll();
    }

    @Cacheable(value = "show", key="#showId")
    public Show findByShowId(Long showId){
        System.out.println("Fetching a show from db");
        return this.dao.findById(showId).get();
    }
}