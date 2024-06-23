package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.Screen;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ScreenDao extends BaseDao<Screen> {
    List<Screen> findAllByShows_Id(Long showId);
}
