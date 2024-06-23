package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.dao.SeatLockDao;
import com.book.my.show.yash.entity.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenService extends BaseService<Screen> {

    @Autowired
    SeatLockDao seatLockDao;

    public ScreenService(BaseDao<Screen> ScreenDao) {
        super(ScreenDao);
    }

}
