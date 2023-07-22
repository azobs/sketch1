package com.sketch1.sketch1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="client",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"clientCni"})})
public class client extends AbstractEntity{
    @Column(nullable = false)
    String clientName;
    @Column(nullable = false)
    String clientCni;
    @Embedded
    Address clientAddress;
}
