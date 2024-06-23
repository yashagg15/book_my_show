package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.entity.Theatre;
import org.springframework.stereotype.Service;


@Service
public class TheatreService extends BaseService<Theatre> {
    public TheatreService(BaseDao<Theatre> theatreDao) {
        super(theatreDao);
    }
}
