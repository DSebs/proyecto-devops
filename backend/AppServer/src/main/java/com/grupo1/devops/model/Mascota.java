package com.grupo1.devops.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota", nullable = false, unique = true)
    private Integer idMascota;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false, length = 50)
    private Integer edad;

    @Column(name = "especie", nullable = false, length = 50)
    private String especie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dueño_id_user", nullable = false)
    private Usuario dueño;




}
