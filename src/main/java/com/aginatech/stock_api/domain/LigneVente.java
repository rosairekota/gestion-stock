package com.aginatech.stock_api.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name ="ligne_ventes")
public class LigneVente extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "vente_id")
    private  Vente vente;

    @Column
    private BigDecimal quantite;
}
