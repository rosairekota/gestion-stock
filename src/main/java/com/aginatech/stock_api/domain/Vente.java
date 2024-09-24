package com.aginatech.stock_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "ventes")
public class Vente  extends BaseEntity{

    @Column
    private  String code;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;
}
