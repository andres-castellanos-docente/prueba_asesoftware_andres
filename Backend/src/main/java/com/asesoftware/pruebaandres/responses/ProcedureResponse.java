package com.asesoftware.pruebaandres.responses;

import io.swagger.v3.oas.annotations.Hidden;

import java.sql.Date;

@Hidden
public class ProcedureResponse {
    private String NOM_COMERCIO;

    private String NOM_SERVICIO;
    private Date FECHA_TURNO;

    public ProcedureResponse() {
    }

    public String getNOM_COMERCIO() {
        return NOM_COMERCIO;
    }

    public void setNOM_COMERCIO(String NOM_COMERCIO) {
        this.NOM_COMERCIO = NOM_COMERCIO;
    }

    public String getNOM_SERVICIO() {
        return NOM_SERVICIO;
    }

    public void setNOM_SERVICIO(String NOM_SERVICIO) {
        this.NOM_SERVICIO = NOM_SERVICIO;
    }

    public Date getFECHA_TURNO() {
        return FECHA_TURNO;
    }

    public void setFECHA_TURNO(Date FECHA_TURNO) {
        this.FECHA_TURNO = FECHA_TURNO;
    }
}
