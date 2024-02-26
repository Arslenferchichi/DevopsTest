package com.example.twin.RestController;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Etudiant;
import com.example.twin.Services.IBlocService;
import com.example.twin.Services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/etudiants")
public class EtudiantRestController {
    IEtudiantService iEtudiantService;
    @GetMapping("/affichertout")
    List<Etudiant> retrieveEtudiants() {return iEtudiantService.retrieveAllEtudiants(); }
    @PostMapping("/ajouteretudiant")
    List<Etudiant> addEtudiant(@RequestBody List<Etudiant> etudiant) {return iEtudiantService.addEtudiants(etudiant); }
    @PutMapping("/modifieretudiant")
    Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.updateEtudiant(etudiant);
    }
    @GetMapping("/afficheretudiant/{idEtudiant}")
    Etudiant retrieveEtudiant(@PathVariable long idEtudiant) {return iEtudiantService.retrieveEtudiant(idEtudiant); }
    @DeleteMapping("/supprimeretudiant/{idEtudiant}")
    void removeEtudiant(@PathVariable long idEtudiant) {iEtudiantService.removeEtudiant(idEtudiant); }
}
