package com.asesoftware.pruebaandres.responses;

import java.util.List;

public class ComerciosListResponse extends ResponseGeneralArr {

    public List<ComercioResponseDto> getComercios() {
        return comercios;
    }

    public void setComercios(List<ComercioResponseDto> comercios) {
        this.comercios = comercios;
    }

    List<ComercioResponseDto> comercios;

    public ComerciosListResponse(Integer responseCode, List<String> responseDescription, List<ComercioResponseDto> comercios, Integer status) {
        setResponseCode(responseCode);
        setResponseDescription(responseDescription);
        setStatus(status);
        setComercios(comercios);
    }

    public ComerciosListResponse(Integer responseCode, List<String> responseDescription, Integer status) {
        setResponseCode(responseCode);
        setResponseDescription(responseDescription);
        setStatus(status);
    }
    public ComerciosListResponse() {
    }




}
