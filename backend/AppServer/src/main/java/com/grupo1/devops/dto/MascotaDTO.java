package com.grupo1.devops.dto;

import com.grupo1.devops.model.Mascota;
import lombok.Data;

import java.util.List;

@Data
public class MascotaDTO {
    private Integer idMascota;
    private String nombre;
    private Integer edad;
    private String especie;
    private List<Mascota> mascotas;
}
