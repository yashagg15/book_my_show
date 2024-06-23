package com.book.my.show.yash.event;

import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.Seat;
import com.book.my.show.yash.entity.SeatLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SchedulerService {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    @Autowired
    SeatLockDao seatLockDao;

    @Autowired
    RedisTemplate<String ,Object> redisTemplate;

    @Scheduled(fixedDelay = 1000 * 10)
    public void myScheduler() {
        System.err.println("ConsumerService.myScheduler");
        ConsumerService.concurrentHashMap.forEach((k, v) -> {
            final Map<String, Object> params = v.getParams();
            final Long showId = (Long) params.get("showId");
            final List<Seat> seats = (List<Seat>) params.get("seats");
            seats.forEach(s -> {
                final int incrementAndGet = atomicInteger.incrementAndGet();
                System.out.println("incrementAndGet = " + incrementAndGet);
                final SeatLock oldSeatLock = seatLockDao.findByShowIdAndSeatId(showId, s.getId());
                System.out.println("oldSeatLock = " + oldSeatLock);

                if (incrementAndGet == 10) {//think this is time out/session out for that event / user's event
                    oldSeatLock.setLockStatus("available");
                    seatLockDao.save(oldSeatLock);
                }
            });
        });
    }

    @Scheduled(fixedDelay = 10*1000)
    public void printRedisCache(){
        System.out.println("Printing cache "+redisTemplate.opsForList().getOperations().keys("movies"));
    }
}
