package com.aginatech.stock_api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;


@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
/*AuditingEntityListener: Permet d'assigner automatiquement
des valeurs createAt et updatedAt une fois que l'entite est mise a jour
*/
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @CreatedDate
    @JsonIgnore // permet d'ignorer la proprieter lorsqu'on get l'entite[GET]
    @Column(name="create_at")
    private Instant createAt;


    @LastModifiedDate
    @JsonIgnore
    @Column(name = "updated_at")
    private  Instant updatedAt;
}
