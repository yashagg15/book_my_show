package com.book.my.show.yash.controller;


import com.book.my.show.yash.dto.TheatreDto;
import com.book.my.show.yash.entity.Theatre;
import com.book.my.show.yash.service.TheatreService;
import io.swagger.v3.oas.annotations.Operation;
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
@RequestMapping("/api/theatre")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Theatre API", description = "API for manging theatres")
public class TheatreController {

    public static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    TheatreService theatreService;

    @GetMapping("/all")
    @Operation(summary = "Find all theatres", description = "Look for all theatres")
    public ResponseEntity<?> findAllTheatres(){

        List<TheatreDto> allTheatres = null;

        try {
            List<Theatre> theatres = theatreService.findAll();
            allTheatres =  theatres.stream().map(theatre->modelMapper.map(theatre,TheatreDto.class)).collect(Collectors.toList());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage().toString(),HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(allTheatres,HttpStatus.OK);
    }

    @GetMapping("/{theatreId}")
    @Operation(summary = "Find all theatres", description = "Look for all theatres")
    public TheatreDto findTheatreById(@PathVariable("theatreId") Long id){
        Theatre theatre = theatreService.findById(id);
        return modelMapper.map(theatre,TheatreDto.class);
    }

    @PostMapping("/save")
    @Operation(summary = "save a theatre", description = "saving theatres")
    public ResponseEntity<String> saveTheatre(@RequestBody TheatreDto theatreDto){
        Theatre theatre = modelMapper.map(theatreDto,Theatre.class);
        theatreService.save(theatre);
        return new ResponseEntity("Theatre has been saved successfully",HttpStatus.OK);
    }

}
