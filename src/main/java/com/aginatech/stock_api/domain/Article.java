package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "article")
public class Article extends  BaseEntity {

    @Column(name = "code_article")
    private  String codeArticle;

    @Column
    private  String designation;

    @Column(name = "prix_unitaire_htva")
    private BigDecimal prixUnitaireHTVA;

    @Column(name = "taux_tva")
    private  BigDecimal TauxTva;
    @Column(name = "prix_unitaire_ttc")
    private  BigDecimal prixUnitaireTtc;

    @Column
    private  String image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categorie caterorie;

}
