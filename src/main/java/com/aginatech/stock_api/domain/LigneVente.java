package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@Entity
@Table(name ="ligne_ventes")
public class LigneVente extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "vente_id")
    private  Vente vente;

    @Column
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private  BigDecimal prixUnitaire;
}
