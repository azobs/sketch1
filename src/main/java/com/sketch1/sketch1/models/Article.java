package com.sketch1.sketch1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"artCode"})})
public class Article extends AbstractEntity {

    @Column(nullable = false)
    private String artCode;

    @Column(nullable = false)
    private String artName;

    @Column(nullable = false)
    private BigDecimal artPrice;
}
