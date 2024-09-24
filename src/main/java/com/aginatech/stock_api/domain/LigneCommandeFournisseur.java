package com.aginatech.stock_api.domain;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ligneCommandes_fournisseur")
public class LigneCommandeFournisseur extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "article_id")
    private  Article article;

    @ManyToOne
    @JoinColumn(name = "commande_fournisseur_id")
    private  CommandeFournisseur commandeFournisseur;

    @Column
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private  BigDecimal prixUnitaire;
}
