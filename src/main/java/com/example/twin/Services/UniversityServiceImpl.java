package com.example.twin.Services;

import com.example.twin.Entity.Chambre;
import com.example.twin.Entity.Etudiant;
import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Universite;
import com.example.twin.Repositories.FoyerRepo;
import com.example.twin.Repositories.UniversiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversityServiceImpl implements IUniversityService {
    UniversiteRepo universiteRepo;
    FoyerRepo foyerRepo;
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }


    public Universite addUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    public Universite updateUniversity(Universite u) {
        return universiteRepo.save(u);
    }

    public Universite retrieveUniversity(long idUniversite) { return universiteRepo.findById(idUniversite).orElse(null); }

    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer=foyerRepo.findById(idFoyer).orElse(null);
        Universite universite=universiteRepo.findUniversiteByNomUniversite(nomUniversite);
        //foyer.setU(universite);
        universite.setF(foyer);
        return universiteRepo.save(universite);
    }

    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        if (universite != null) {
                universite.setF(null);
                universiteRepo.save(universite);
        }
        return universite;
    }
    //public Universite desaffecterFoyerAUniversite(long idUniversite) {
      //  Universite universite = universiteRepo.findById(idUniversite).orElse(null);
        //if (universite != null) {
            //Foyer foyer = universite.getF();
            //if (foyer != null) {
            //foyer.setU(null);
          //  universite.setF(null);
            //universiteRepo.save(universite);
            //foyerRepo.save(foyer);
            //}
        //}
        //return universite;
    //}

}
