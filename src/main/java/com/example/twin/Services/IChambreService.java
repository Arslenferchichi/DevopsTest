package com.example.twin.Services;

import com.example.twin.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c); // ajouter l’équipe avec son détail

    Chambre updateChambre (Chambre  c);

    Chambre retrieveChambre (long idChambre);

    List<Chambre> getChambreByNomBloc(String nom);



}
