package com.example.twin.RestController;

import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Reservation;
import com.example.twin.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservations")
public class ReservationRestController {
    IReservationService iReservationService;
    @GetMapping("/affichertout")
    List<Reservation> retrieveReservation() {return iReservationService.retrieveAllReservation(); }
    @PostMapping("/ajouterreservation")
    Reservation addReservation(@RequestBody Reservation reservation) {return iReservationService.addReservation(reservation); }
    @PutMapping("/modifierreservation")
    Reservation updateReservation(@RequestBody Reservation reservation) {return iReservationService.updateReservation(reservation); }
    @GetMapping("/afficherreservation/{idReservation}")
    Reservation retrieveReservation(@PathVariable String idReservation) {return iReservationService.retrieveReservation(idReservation); }
}
