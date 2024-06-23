package com.book.my.show.yash.controller;

import com.book.my.show.yash.dto.MovieDto;
import com.book.my.show.yash.dto.ResponseDto;
import com.book.my.show.yash.entity.Movie;
import com.book.my.show.yash.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/movie")
@EnableCaching
@SecurityRequirement(name = "Authorization")
@Tag(name = "Movie API", description = "API for managing movies")
public class MovieController {

    public static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    MovieService movieService;

    @GetMapping("/all")
    @Operation(summary = "Find all movies", description = "Find all movies")
    public ResponseEntity<ResponseDto> findAllMovies(){
        long requestArrive = System.currentTimeMillis();
        List<Movie> movies = movieService.getAllMovies();
        List<MovieDto> movieDtos =  movies.stream().
                map(movie->modelMapper.map(movie,MovieDto.class)).collect(Collectors.toList());
        long requestCompleted = System.currentTimeMillis();
        long totalTime = requestCompleted - requestArrive;
        System.out.println("Time taken to serve response: "+totalTime);
        ResponseDto responseDto = ResponseDto.builder().
                datalist(movieDtos).responseTime(String.valueOf(totalTime))
                        .errorMessage("").build();
        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }


    @GetMapping("/{movieId}")
    @Operation(summary = "Find a movie", description = "Find particular movie")
    public ResponseEntity<ResponseDto> findAMovie(@PathVariable("movieId") Long id){
        long requestArrive = System.currentTimeMillis();
        Movie movie = movieService.findById(id);
        MovieDto movieDto = modelMapper.map(movie,MovieDto.class);
        long requestCompleted = System.currentTimeMillis();
        long totalTime = requestCompleted - requestArrive;
        ResponseDto responseDto = ResponseDto.builder().
                dataObject(movieDto).responseTime(String.valueOf(totalTime))
                .errorMessage("").build();
        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }

    @PostMapping("/save")
    @Operation(summary = "Save a movie", description = "Saving a particular movie")
    public ResponseEntity<ResponseDto> saveMovie(@RequestBody MovieDto movieDto){
        long requestArrive = System.currentTimeMillis();
        Movie movie = modelMapper.map(movieDto,Movie.class);
        movieService.save(movie);
        long requestCompleted = System.currentTimeMillis();
        long totalTime = requestCompleted - requestArrive;
        ResponseDto responseDto = ResponseDto.builder().
                dataObject("Movie saved successfully").responseTime(String.valueOf(totalTime))
                .errorMessage("").build();
        return new ResponseEntity<>(responseDto,HttpStatus.OK);
    }

}

