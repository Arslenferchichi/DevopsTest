package com.example.twin.Services;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Chambre;
import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Universite;
import com.example.twin.Repositories.BlocRepo;
import com.example.twin.Repositories.FoyerRepo;
import com.example.twin.Repositories.UniversiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    FoyerRepo foyerRepo;
    BlocRepo blocRepo;
    UniversiteRepo universiteRepo;

    public List<Foyer> retrieveAllFoyers() {
        return foyerRepo.findAll();
    }

    public Foyer updateFoyer(Foyer f) { return foyerRepo.save(f); }

    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

   // public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite){
     //   Universite universite = universiteRepo.findUniversiteByIdUniversite(idUniversite);
       // List<Foyer> foyers = foyerRepo.findAll();
    //}

}
