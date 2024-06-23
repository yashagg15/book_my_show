package com.book.my.show.yash.service;

import com.book.my.show.yash.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class NotificationService {

    //async method
    public void sendNotificationToUser(User user) {
        log.info("payment failed for user {} , please select and book ticket again", user.getName());
    }
}
