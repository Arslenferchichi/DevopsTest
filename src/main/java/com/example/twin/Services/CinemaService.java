package com.example.twin.Services;


import com.example.twin.Entity.Cinema;
import com.example.twin.Repositories.CinemaRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CinemaService {
  CinemaRepo cinemaRepo;
    public Cinema ajouterCinema(Cinema c) {
        return cinemaRepo.save(c);
    }
}
