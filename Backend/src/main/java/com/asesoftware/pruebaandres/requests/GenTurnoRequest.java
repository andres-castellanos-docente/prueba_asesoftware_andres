package com.asesoftware.pruebaandres.requests;

import io.swagger.v3.oas.annotations.Hidden;

import java.util.Date;

@Hidden
public class GenTurnoRequest {
    private String fecha_ini;

    private String fecha_fin;

    private Integer id_servicio;

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Integer getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Integer id_servicio) {
        this.id_servicio = id_servicio;
    }

    public GenTurnoRequest() {

    }


}
