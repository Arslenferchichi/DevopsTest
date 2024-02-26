package com.example.twin.Services;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Universite;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();

    Foyer addFoyer (Foyer f);

    Foyer updateFoyer (Foyer f);

    Foyer retrieveFoyer (long  idFoyer);

    //Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;



   // public Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer) ;


}
