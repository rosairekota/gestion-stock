package com.aginatech.stock_api.domain;

import com.aginatech.stock_api.services.TypeMvtStock;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@Entity
@Table(name = "mouvement_stock")
public class MvtSock  extends BaseEntity{
    @Column(name = "date_mvt")
    private Instant dateMvt;

    @Column
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private  Article article;

    @Column(name = "type_mvt")
    private TypeMvtStock typeMvt;
}
