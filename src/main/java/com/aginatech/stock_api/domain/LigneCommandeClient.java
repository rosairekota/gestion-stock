package com.aginatech.stock_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ligne_commandes_client")
public class LigneCommandeClient extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;
}
