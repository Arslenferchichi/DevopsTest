package com.example.twin.Services;

import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation addReservation (Reservation res);

    Reservation updateReservation (Reservation  res);

    Reservation retrieveReservation (String idReservation);

}
