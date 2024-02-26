package com.example.twin.Services;

import com.example.twin.Entity.Chambre;
import com.example.twin.Entity.Etudiant;
import com.example.twin.Repositories.EtudiantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepo etudiantRepo;

    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepo.findAll();
    }

    public List<Etudiant> addEtudiants(List<Etudiant> etudiant) {
        return etudiantRepo.saveAll(etudiant);
    }

    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    public Etudiant retrieveEtudiant(long idEtudiant) { return etudiantRepo.findById(idEtudiant).orElse(null); }

    public void removeEtudiant(long idEtudiant) {
        etudiantRepo.deleteById(idEtudiant);
    }
}
