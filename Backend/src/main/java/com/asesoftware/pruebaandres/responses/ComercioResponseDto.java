package com.asesoftware.pruebaandres.responses;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
public class ComercioResponseDto {
    private Integer id_comercio;
    private String nombre_comercio;


    public ComercioResponseDto(ComerciosEntity comerciosEntity) {
        setId_comercio(comerciosEntity.getIdComercio());
        setNombre_comercio(comerciosEntity.getNomComercio());
    }
    public ComercioResponseDto() {

    }

    public Integer getId_comercio() {
        return id_comercio;
    }

    public void setId_comercio(Integer id_comercio) {
        this.id_comercio = id_comercio;
    }

    public String getNombre_comercio() {
        return nombre_comercio;
    }

    public void setNombre_comercio(String nombre_comercio) {
        this.nombre_comercio = nombre_comercio;
    }
}
