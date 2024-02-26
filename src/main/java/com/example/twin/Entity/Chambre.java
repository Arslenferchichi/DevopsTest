package com.example.twin.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    long numeroChambre;
    long capacite;
    @Enumerated(EnumType.STRING)
    TypeChambre TypeC;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    Bloc b;

    @OneToMany(cascade = CascadeType.ALL)
    List<Reservation> r;

}

