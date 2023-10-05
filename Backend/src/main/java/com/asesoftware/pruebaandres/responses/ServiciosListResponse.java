package com.asesoftware.pruebaandres.responses;

import java.util.List;

public class ServiciosListResponse extends ResponseGeneralArr {

    public List<ServicioResponseDto> getServicios() {
        return servicios;
    }

    public void setServicios(List<ServicioResponseDto> servicios) {
        this.servicios = servicios;
    }

    List<ServicioResponseDto> servicios;

    public ServiciosListResponse(Integer responseCode, List<String> responseDescription, List<ServicioResponseDto> servicios, Integer status) {
        setResponseCode(responseCode);
        setResponseDescription(responseDescription);
        setStatus(status);
        setServicios(servicios);
    }

    public ServiciosListResponse(Integer responseCode, List<String> responseDescription, Integer status) {
        setResponseCode(responseCode);
        setResponseDescription(responseDescription);
        setStatus(status);
    }
    public ServiciosListResponse() {
    }




}
