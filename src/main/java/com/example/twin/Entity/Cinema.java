package com.example.twin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    String adresse;
    int telephone;
//    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//    Set<Film>films;
//    @ManyToMany
//    Set<Film>filmss;
}
