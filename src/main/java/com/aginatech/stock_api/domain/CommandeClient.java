package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "commande_client")
public class CommandeClient  extends  BaseEntity{
    @Column(name = "code_reference")
    private  String codeReference;

    @Column
    private Instant dateCommande;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
