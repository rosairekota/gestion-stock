package com.aginatech.stock_api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "categorie")
public class Categorie extends  BaseEntity {
    @Column
    private String code;

    @Column
    private  String designation;

    @OneToMany(mappedBy = "caterorie")
    private List<Article> articles;
}
