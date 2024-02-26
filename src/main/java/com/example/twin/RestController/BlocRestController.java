package com.example.twin.RestController;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Universite;
import com.example.twin.Services.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/blocs")
public class BlocRestController {
    IBlocService iBlocService;
    @GetMapping("/affichertout")
    List<Bloc> retrieveBlocs() {return iBlocService.retrieveBlocs(); }
    @PostMapping("/ajouterbloc")
    Bloc addBloc(@RequestBody Bloc bloc) {return iBlocService.addBloc(bloc); }
    @PutMapping("/modifierbloc")
    Bloc updateBloc(@RequestBody Bloc bloc) {
        return iBlocService.updateBloc(bloc);
    }
    @GetMapping("/afficherbloc/{idBloc}")
    Bloc retrieveBloc(@PathVariable long idBloc) {return iBlocService.retrieveBloc(idBloc); }
    @DeleteMapping("/supprimerbloc/{idBloc}")
    void removeBloc(@PathVariable long idBloc) {iBlocService.removeBloc(idBloc); }
    @PutMapping("/affecter/{nom}")
    Bloc affecterChambresABloc(@RequestBody List<Long> numChambre, @PathVariable("nom") String nomBloc){return iBlocService.affecterChambresABloc(numChambre,nomBloc); }



}
