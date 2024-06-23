package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.Theatre;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TheaterDao extends BaseDao<Theatre> {
    List<Theatre> findAllByScreens_Id(Long screenId);
}
