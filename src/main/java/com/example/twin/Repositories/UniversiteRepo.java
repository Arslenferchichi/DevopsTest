package com.example.twin.Repositories;

import com.example.twin.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite,Long> {
    Universite findUniversiteByNomUniversite(String nom);
    Universite findUniversiteByIdUniversite(Long idUniversite);

}
