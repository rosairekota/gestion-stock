package com.aginatech.stock_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="ligne_ventes")
public class LigneVente extends BaseEntity{
}
