package com.example.twin.Repositories;

import com.example.twin.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,String> {

    List<Reservation> findReservationsByAnneeUniversitaireBetween(Date debut, Date fin);

    long countReservationsByAnneeUniversitaireBetween(Date debut, Date fin);
}
