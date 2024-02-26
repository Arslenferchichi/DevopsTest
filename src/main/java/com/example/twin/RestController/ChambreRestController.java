package com.example.twin.RestController;

import com.example.twin.Entity.Chambre;
import com.example.twin.Services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/chambres")
public class ChambreRestController {
    IChambreService iChambreService;
    @GetMapping("/affichertout")
    List<Chambre> retrieveAllChambres(){
        return iChambreService.retrieveAllChambres();
    }
    @PostMapping ("/ajouterchambre")
    Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }
    @PutMapping("/modifierchambre")
    Chambre updateChambre (@RequestBody Chambre  c){
        return iChambreService.updateChambre(c);
    }
    @GetMapping("/afficherchambre/{idChambre}")
    Chambre retrieveChambre (@PathVariable long idChambre){
        return iChambreService.retrieveChambre(idChambre);
    }
    @GetMapping("/get/{nom}")
    public List<Chambre> getChambreByNomBloc(@PathVariable("nom") String nom){
        return iChambreService.getChambreByNomBloc(nom);
    }
}
