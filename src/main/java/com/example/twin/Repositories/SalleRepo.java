package com.example.twin.Repositories;

import com.example.twin.Entity.Salle;
import com.example.twin.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepo extends JpaRepository<Salle,Long> {
}
