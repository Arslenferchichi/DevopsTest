package com.example.twin.RestController;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Foyer;
import com.example.twin.Services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/foyers")
public class FoyerRestController {
    IFoyerService iFoyerService;
    @GetMapping("/affichertout")
    List<Foyer> retrieveFoyer() {return iFoyerService.retrieveAllFoyers(); }
    @PostMapping("/ajouterfoyer")
    Foyer addFoyer(@RequestBody Foyer foyer) {return iFoyerService.addFoyer(foyer); }
    @PutMapping("/modifierfoyer")
    Foyer updateFoyer(@RequestBody Foyer foyer) {
        return iFoyerService.updateFoyer(foyer);
    }
    @GetMapping("/afficherfoyer/{idFoyer}")
    Foyer retrieveFoyer(@PathVariable long idFoyer) {return iFoyerService.retrieveFoyer(idFoyer); }

}
