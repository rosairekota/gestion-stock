package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client extends BaseEntity{

    @Column
    private  String nom;

    @Column
    private  String prenom;

    @Embedded // entite reutilisable
    private  Adresse adresse;

    @Column
    private  String email;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> CommandeClients;


    private  String telephone;
}
