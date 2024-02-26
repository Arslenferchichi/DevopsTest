package com.example.twin.Services;

import com.example.twin.Entity.Universite;

import java.util.List;

public interface IUniversityService {
    List<Universite> retrieveAllUniversities();

    Universite addUniversity (Universite u);

    Universite updateUniversity (Universite u);

    Universite retrieveUniversity (long idUniversite);

    Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);

    Universite desaffecterFoyerAUniversite (long idUniversite);
}
