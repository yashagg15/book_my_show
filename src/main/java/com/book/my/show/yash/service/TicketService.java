package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.SeatLock;
import com.book.my.show.yash.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class TicketService extends BaseService<Ticket> {

    @Autowired
    SeatLockDao seatLockDao;

    public TicketService(BaseDao<Ticket> dao) {
        super(dao);
    }

    /**
     * Creating ticket
     * Approach :
     * 1. get ticket obj : contains show, seats id in string, userid
     * 2. get lock obj using show id & seat id
     * 3. check if status is locked then stop coz someone has booked this show's seat
     * 4. if status is available then change to locked and create ticket object
     * 5. do above in synchronized block
     * @param ticket
     * @return
     */
    @Override
    public Ticket save(Ticket ticket) {
        synchronized (this) {
        final Ticket fetchedTicket = super.save(ticket);
            final Long showId = ticket.getShow().getId();
            final String[] split = ticket.getSeatIds().split(",");
            Arrays.stream(split).forEach(System.err::println);

            Arrays.stream(split).forEach(s -> {
                final Long seatId = Long.valueOf(s);
                final SeatLock beforeLock = seatLockDao.findByShowIdAndSeatId(showId, seatId);
                System.err.println("beforeLock = " + beforeLock);

                beforeLock.setLockStatus("locked");
                final SeatLock afterLock = seatLockDao.save(beforeLock);
                System.err.println("afterLock = " + afterLock);
            });
        return fetchedTicket;
        }
    }

    @Cacheable(value = "tickets", key = "#ticketId")
    public Ticket fetchTicket(Long ticketId) {//testing caching
        System.out.println("Fetch ticket from db");//3 for testing
        return dao.findById(ticketId).get();
    }

}
