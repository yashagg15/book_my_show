package com.book.my.show.yash.controller;

import com.book.my.show.yash.dto.ScreenDto;
import com.book.my.show.yash.entity.Screen;
import com.book.my.show.yash.entity.Theatre;
import com.book.my.show.yash.service.ScreenService;
import com.book.my.show.yash.service.TheatreService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/screen")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Screen API", description = "API for managing theatre screens")
public class ScreenController {

    @Autowired
    ScreenService screenService;

    @Autowired
    TheatreService theatreService;

    public ModelMapper modelMapper = new ModelMapper();

    @GetMapping("/{screenId}")
    public ResponseEntity<ScreenDto> findAScreen(@PathVariable("screenId") Long id){
        Screen screen =  screenService.findById(id);
        ScreenDto screenDto =  modelMapper.map(screen,ScreenDto.class);
        screenDto.setTheatreName(screen.getTheatre().getTheaterName());
        return  new ResponseEntity<>(screenDto,HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<ScreenDto>> findAllScreen(){
        List<Screen> screens =  screenService.findAll();
        List<ScreenDto> screenDtos
                = screens.stream().map(screen -> modelMapper.map(screen,ScreenDto.class)).
                collect(Collectors.toList());
        return new ResponseEntity<>(screenDtos,HttpStatus.OK);

    }

    @PostMapping("/save/{theatreId}")
    public ResponseEntity<String> saveAScreen(@RequestBody ScreenDto screenDto
    ,@PathVariable("theatreId") Long theatreId){
        Theatre theatre = theatreService.findById(theatreId);
        Screen screen = modelMapper.map(screenDto,Screen.class);
        screen.setTheatre(theatre);
        screenService.save(screen);
        return new ResponseEntity<>( "Screen saved", HttpStatus.OK);
    }
}
