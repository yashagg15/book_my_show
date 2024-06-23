package com.book.my.show.yash.event;

import com.book.my.show.yash.entity.Event;
import com.book.my.show.yash.entity.Seat;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ConsumerService {
    public static ConcurrentHashMap<String, Event> concurrentHashMap = new ConcurrentHashMap<>();

    @EventListener
    public void consumerStart(Event event) {
        System.out.println("event consuming = " + event);
        final Map<String, Object> params = event.getParams();
        final Long showId = (Long) params.get("showId");
        final List<Seat> seats = (List<Seat>) params.get("seats");
        final LocalDateTime localDateTime = event.getLocalDateTime();
        System.out.println("showId = " + showId);
        System.out.println("seats = " + seats);
        System.out.println("localDateTime = " + localDateTime);
        concurrentHashMap.put(event.getName(), event);
    }
}
