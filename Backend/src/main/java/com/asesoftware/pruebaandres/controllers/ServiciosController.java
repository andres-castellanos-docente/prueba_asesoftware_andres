package com.asesoftware.pruebaandres.controllers;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.responses.ComerciosListResponse;
import com.asesoftware.pruebaandres.responses.ServiciosListResponse;
import com.asesoftware.pruebaandres.services.ComerciosService;
import com.asesoftware.pruebaandres.services.ServiciosService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class ServiciosController {
    @Autowired
    ServiciosService serviciosService;

    @Autowired
    ComerciosService comerciosService;

    @Operation(summary = "Leer Servicios ", description = "Lee todos los Servicios")
    @GetMapping("/servicios")
        public ResponseEntity<ServiciosListResponse> getServicios() {
        return serviciosService.leerServicios();
    }

    @Operation(summary = "Leer Servicios ", description = "Lee todos los Servicios")
    @GetMapping("/serviciosbyComercio/{idcomercio}")
    public ResponseEntity<ServiciosListResponse> getServiciosByComercio(@PathVariable(value = "idcomercio") Integer IdComercio) {
        List<ComerciosEntity> comercio = comerciosService.leerComerciosById(IdComercio);
        return serviciosService.leerServiciosByComercio(comercio.get(0));
    }

}
