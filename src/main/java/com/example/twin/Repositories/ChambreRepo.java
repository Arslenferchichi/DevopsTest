package com.example.twin.Repositories;

import com.example.twin.Entity.Chambre;
import com.example.twin.Entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
    //List<Chambre>findChambresByR_
    List<Chambre> findChambresByB_NomBloc(String nom);
    //Chambre findChambreByNumeroChambre(long num);
   //@Query("SELECT c.numeroChambre FROM Chambre c WHERE c.numeroChambre IN :numChambre")
   //List<Chambre> findChambreByNumeroChambre(@Param("numChambre") List<Long> numChambre);
    //List<Chambre> findChambreByNumeroChambre(List<Long> numeroChambre);
    List<Chambre> findChambreByNumeroChambreIn(List<Long> numerosChambre);


    //int countChambreByTypeCAndAndB_IdBloc(TypeChambre typeChambre,long id);
    @Query("select chambre from Chambre chambre join chambre.r reservation where reservation.anneeUniversitaire>:debut and reservation.anneeUniversitaire<:fin")
    List<Chambre>findChambresByR(@Param("debut") LocalDate debut,@Param("fin") LocalDate fin);
    //List<Chambre>findChambresByB_F
    //@Query("select chambre from Chambre chambre join chambre.b bloc join")
    //List<Chambre>getByNomUniversite(String nomUniversitae);
}
