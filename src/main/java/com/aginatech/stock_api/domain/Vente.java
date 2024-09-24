package com.aginatech.stock_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ventes")
public class Vente  extends BaseEntity{
}
