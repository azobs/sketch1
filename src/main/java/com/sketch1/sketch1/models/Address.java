package com.sketch1.sketch1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    String numtel1;
    @Column(nullable = false, unique = true)
    String email;
}
