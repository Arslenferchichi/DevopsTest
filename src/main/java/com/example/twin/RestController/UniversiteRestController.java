package com.example.twin.RestController;

import com.example.twin.Entity.Foyer;
import com.example.twin.Entity.Universite;
import com.example.twin.Services.IFoyerService;
import com.example.twin.Services.IUniversityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/universites")
public class UniversiteRestController {
    IUniversityService iUniversityService;
    @GetMapping("/affichertout")
    List<Universite> retrieveUniversite() {return iUniversityService.retrieveAllUniversities(); }
    @PostMapping("/ajouteruniversite")
    Universite addUniversite(@RequestBody Universite universite) {return iUniversityService.addUniversity(universite); }
    @PutMapping("/modifieruniversite")
    Universite updateUniversite(@RequestBody Universite universite) {return iUniversityService.updateUniversity(universite); }
    @GetMapping("/afficheruniversite/{idUniversite}")
    Universite retrieveUniversite(@PathVariable long idUniversite) {return iUniversityService.retrieveUniversity(idUniversite); }
    @PutMapping("/affecterFoyer/{idF}/{nomU}")
    Universite affecterFoyerAUniversite(@PathVariable("idF") long idFoyer,@PathVariable("nomU") String nomUniversite){return iUniversityService.affecterFoyerAUniversite(idFoyer,nomUniversite); }
    @PutMapping("/desaffecterFoyer/{idU}")
    Universite desaffecterFoyerAUniversite(@PathVariable("idU") long idUniversite){return iUniversityService.desaffecterFoyerAUniversite(idUniversite); }

}
