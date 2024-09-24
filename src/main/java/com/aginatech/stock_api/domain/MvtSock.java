package com.aginatech.stock_api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "mouvement_stock")
public class MvtSock  extends BaseEntity{
}
