package com.example.twin.Repositories;

import com.example.twin.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepo extends JpaRepository<Bloc,Long> {
Bloc findBlocByNomBloc(String nom);
}
