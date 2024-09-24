package com.aginatech.stock_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable // permet de le reutiliser
public class Adresse {

    @Column
    private  String adresse1;

    @Column
    private  String adresse2;

    @Column
    private  String ville;

    @Column
    private String codePostal;

    @Column
    private  String pays;
}

