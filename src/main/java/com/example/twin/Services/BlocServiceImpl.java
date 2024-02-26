package com.example.twin.Services;

import com.example.twin.Entity.Bloc;
import com.example.twin.Entity.Chambre;
import com.example.twin.Repositories.BlocRepo;
import com.example.twin.Repositories.ChambreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    BlocRepo blocRepo;
    ChambreRepo chambreRepo;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {

    }
    //public Bloc affecterChambresABloc(List<Long> numChambre , String nomBloc){
    //  Bloc bloc=blocRepo.findBlocByNomBloc(nomBloc);
    //    List<Chambre>chambres=null;//deuxieme methode
    //   for(long num:numChambre){
    //       Chambre chambre=chambreRepo.findChambreByNumeroChambre(num);//
    //        chambre.setB(bloc);//le_plus_important.le_moin_important(cardinalités)
    //        chambres.add(chambre);
    //    }
            //( chambreRepo.findChambreByNumeroChambre(num)).setB(bloc);
    //    chambreRepo.saveAll(chambres);
    //    return bloc;
    //}

    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc bloc = blocRepo.findBlocByNomBloc(nomBloc);
        if (bloc != null) {
            List<Chambre> chambres = chambreRepo.findChambreByNumeroChambreIn(numChambre);
            Set<Chambre> chambreSet = new HashSet<>(chambres);
            for (Chambre chambre : chambreSet) {
                chambre.setB(bloc);
            }
           // bloc.setCh(chambreSet);
            blocRepo.save(bloc);
        }
        return bloc;
    }
}
