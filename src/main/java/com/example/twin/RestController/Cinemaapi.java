package com.example.twin.RestController;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Cinema;
import com.example.twin.Services.CinemaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/cinema")
public class Cinemaapi {
    CinemaService cinemaService;

    @PostMapping("/ajoutercinema")
    Cinema addCinema(@RequestBody Cinema cinema) {return cinemaService.ajouterCinema(cinema); }
}
