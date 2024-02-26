package com.example.twin.Services;

import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Reservation;
import com.example.twin.Repositories.ReservationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    ReservationRepo reservationRepo;

    public List<Reservation> retrieveAllReservation() {
        return reservationRepo.findAll();
    }

    public Reservation addReservation(Reservation r) { return reservationRepo.save(r); }

    public Reservation updateReservation(Reservation r) { return reservationRepo.save(r); }

    public Reservation retrieveReservation(String idReservation) {
        return reservationRepo.findById(idReservation).orElse(null);
    }
    String genererId(long cin,long numChambre){
        return null;
    }

    public Reservation ajouterReservation(Reservation reservation, long idChambre, long cinEtudiant) {
        return null;
    }
}
