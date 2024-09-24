package com.aginatech.stock_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "commande_fournisseur")
public class CommandeFournisseur extends BaseEntity{
}
