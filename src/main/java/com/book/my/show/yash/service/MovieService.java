package com.book.my.show.yash.service;

import com.book.my.show.yash.dao.BaseDao;
import com.book.my.show.yash.entity.Movie;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;


@Service
public class MovieService extends BaseService<Movie> {

    public MovieService(BaseDao<Movie> dao) {
        super(dao);
    }

    private static Logger logger = Logger.getLogger("logger");

    private static String Fetch_FROM_DB = "Values fetched from database";

    @Cacheable(value = "movie_list",key="#root.methodName")
    public List<Movie> getAllMovies(){
        logger.info(Fetch_FROM_DB);
        List<Movie> movies =  dao.findAll();
        return movies;
    }

    @CachePut(value = "movie",key = "#movie.id")
    @CacheEvict(value = "movie_list",allEntries = true,beforeInvocation = false)
    public Movie save(Movie movie){
        logger.info(Fetch_FROM_DB);
        return dao.save(movie);
    }

    @Cacheable(value = "movie",key="#id")
    public Movie findById(Long id){
        logger.info(Fetch_FROM_DB);
        return dao.findById(id).get();
    }
}
