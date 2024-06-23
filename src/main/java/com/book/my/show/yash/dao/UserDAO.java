package com.book.my.show.yash.dao;

import com.book.my.show.yash.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends BaseDao<User> {
    public User findByUserName(String userName);
}
