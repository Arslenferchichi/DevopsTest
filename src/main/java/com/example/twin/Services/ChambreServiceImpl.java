package com.example.twin.Services;

import com.example.twin.Entity.Chambre;
import com.example.twin.Entity.Reservation;
import com.example.twin.Repositories.ChambreRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
@Slf4j
public class ChambreServiceImpl implements IChambreService {
    ChambreRepo chambreRepo;

    @Override
    public List<Chambre> retrieveAllChambres() {return chambreRepo.findAll();}

    @Override
    public Chambre addChambre(Chambre c) {
        System.out.println("ajouter"+c.toString());
        log.info("on a ajoute une chambre"+c.toString());
        return chambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepo.findById(idChambre).orElse(null);
    }

    public  List<Chambre> getChambreByReservationAnneeUniversitaire(LocalDate debut, LocalDate fin){
        List<Chambre> chambres=null;
        for(Chambre c : chambreRepo.findAll())
            for (Reservation r : c.getR())
                if (r.getAnneeUniversitaire().isAfter(debut) && r.getAnneeUniversitaire().isBefore(fin))
                    chambres.add(c);
        return chambres;
       // return chambreRepo.findChambresByR(debut, fin);
    }
    @Override
    public List<Chambre> getChambreByNomBloc(String nom){
        return chambreRepo.findChambresByB_NomBloc(nom);
    }

    //@Scheduled(fixedRate = 5000)
    //@Scheduled(fixedDelay = 5000)
    //@Scheduled(cron = "* 10 5 * * * ")//Chaque seconde de la 10eme minute,5eme heure de chaque jour,mois ,jour de la semaine
    @Scheduled(cron = "*/5 * * * * * ")//Chaque 5 seconde de la 10eme minute de la 5eme heure
    void testSchedular() throws InterruptedException {
        log.info("test scheduling fixedRate");
        //Thread.sleep(5000);fixedDelay
    }
}
