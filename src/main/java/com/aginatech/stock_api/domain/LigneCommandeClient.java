package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name = "ligne_commandes_client")
public class LigneCommandeClient extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;

    @Column
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;
}
