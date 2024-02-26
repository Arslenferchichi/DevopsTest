package com.example.twin.Repositories;

import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepo extends JpaRepository<Foyer,Long> {
    Foyer findFoyerByNomFoyer(String nom);

}
