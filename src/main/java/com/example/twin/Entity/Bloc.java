package com.example.twin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long idBloc;
    String nomBloc;
    long capaciteBloc;
    @ManyToOne
    Foyer f;
    @OneToMany(mappedBy = "b" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    Set<Chambre> ch;
    //4TWIN3
    //DeuxiemeModif
}
