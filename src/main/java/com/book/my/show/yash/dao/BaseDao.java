package com.book.my.show.yash.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface  BaseDao<T> extends JpaRepository<T, Long> {
}
