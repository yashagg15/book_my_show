package com.book.my.show.yash.controller;


import com.book.my.show.yash.dto.ResponseDto;
import com.book.my.show.yash.dto.ShowDto;
import com.book.my.show.yash.entity.*;
import com.book.my.show.yash.service.MovieService;
import com.book.my.show.yash.service.ScreenService;
import com.book.my.show.yash.service.SeatsService;
import com.book.my.show.yash.service.ShowService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/show")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Movie Show API", description = "API for managing booking shows")
public class MovieShowController {

    public static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    ShowService showService;

    @Autowired
    MovieService movieService;

    @Autowired
    SeatsService seatsService;

    @Autowired
    ScreenService screenService;

    @GetMapping("/all")
    @Operation(summary = "Find all movies shows", description = "All movie shows")
    public ResponseEntity<ResponseDto> findAllMovieShows(){
        List<ShowDto> showDtoList = null;
        ResponseDto responseDto = null;
        try {
            long startTime = System.currentTimeMillis();
            List<Show> shows = showService.getAllShows();
            showDtoList = shows.stream().map(show -> {
                        ShowDto showDto = modelMapper.map(show, ShowDto.class);
                        showDto.setMovieName(show.getMovies().getMovieName());
                        if(show.getScreen()!=null) {
                            showDto.setScreenId(show.getScreen().getId());
                            showDto.setScreenName(show.getScreen().getScreenName());
                        }
                        showDto.setSeatIds(populateSeatIds(show));
                        return showDto;
                    }
            ).collect(Collectors.toList());
            long endTime = System.currentTimeMillis();
            long execTime = endTime-startTime;
            System.out.println("Time take to serve respinse "+execTime);
            responseDto = ResponseDto.builder()
                    .datalist(showDtoList).responseTime(String.valueOf(execTime)).build();
        }catch(Exception e){
            return new ResponseEntity<>(ResponseDto.builder().errorMessage(e.getMessage())
                    .build(),HttpStatus.FORBIDDEN);
        }
        return  new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @PostMapping("/save")
    @Operation(summary = "Save a movies shows", description = "save movie shows")
    public ResponseEntity<ResponseDto> saveMovieShow(@RequestBody ShowDto showDto){

        ResponseDto responseDto = null;
        long startTime = System.currentTimeMillis();
        try {

            Show show = modelMapper.map(showDto, Show.class);
            show.setShowName(showDto.getShowName());
            Movie movie = movieService.findById(showDto.getMovieId());
            show.setMovies(movie);
            List<Seat> fetchSeats = seatsService.findAll();
            show.setSeats(fetchSeats);
            if(showDto.getScreenId()!=null){
                Screen screen = screenService.findById(showDto.getScreenId());
                show.setScreen(screen);
            }
            if(showDto.getWeekDay().length()>0){
                String[] days = showDto.getWeekDay().split(":");
                List<Days> weekdays =
                        Arrays.stream(days).map(day->Days.valueOf(day)).collect(Collectors.toList());
                WeekDay weekDay  = WeekDay.builder().days(weekdays).build();
                show.setWeekDay(weekDay);
            }
           Show saveShow = showService.save(show);
            long execTime = System.currentTimeMillis()-startTime;
            responseDto = ResponseDto.builder().dataObject(saveShow)
                    .responseTime(String.valueOf(execTime))
                    .build();
        }catch(Exception e){
            responseDto = ResponseDto.builder().errorMessage(e.getMessage())
                    .build();
            return new ResponseEntity<>(responseDto,HttpStatus.FORBIDDEN);
        }
        return  new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/{showId}")
    public ResponseEntity<ResponseDto> findMovieShows(@PathVariable("showId") Long showId){
        long startTime = System.currentTimeMillis();
        Show show = showService.findByShowId(showId);
        ShowDto showDto = modelMapper.map(show, ShowDto.class);
        showDto.setSeatIds(populateSeatIds(show));
        long endTime = System.currentTimeMillis();
        long execTime = endTime - startTime;
        ResponseDto responseDto =
                ResponseDto.builder().dataObject(showDto).
                        responseTime(String.valueOf(execTime)).build();
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    public List<Long> populateSeatIds(Show show){
        return show.getSeats().stream().map(seat->seat.getId()).
                collect(Collectors.toList());
    }
}
