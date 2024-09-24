package com.aginatech.stock_api.domain;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;


@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    private Integer id;

    @CreatedDate
    private Instant createAt;


    @LastModifiedDate
    private  Instant updatedAt;
}
