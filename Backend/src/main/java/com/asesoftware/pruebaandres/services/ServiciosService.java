package com.asesoftware.pruebaandres.services;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.responses.ComerciosListResponse;
import com.asesoftware.pruebaandres.responses.ServiciosListResponse;
import org.springframework.http.ResponseEntity;

public interface ServiciosService {
    ResponseEntity<ServiciosListResponse> leerServicios();
    ResponseEntity<ServiciosListResponse> leerServiciosByComercio(ComerciosEntity com);
}
