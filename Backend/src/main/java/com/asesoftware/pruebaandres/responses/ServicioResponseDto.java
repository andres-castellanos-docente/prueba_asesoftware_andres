package com.asesoftware.pruebaandres.responses;

import com.asesoftware.pruebaandres.entities.ServiciosEntity;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
public class ServicioResponseDto {
    private Integer id_servicio;
    private String nom_servicio;


    public ServicioResponseDto(ServiciosEntity serviciosEntity) {
        setId_servicio(serviciosEntity.getIdComercio());
        setNom_servicio(serviciosEntity.getNomServicio());
    }
    public ServicioResponseDto() {

    }

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNom_servicio() {
        return nom_servicio;
    }

    public void setNom_servicio(String nom_servicio) {
        this.nom_servicio = nom_servicio;
    }
}
