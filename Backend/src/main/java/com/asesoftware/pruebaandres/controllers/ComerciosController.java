package com.asesoftware.pruebaandres.controllers;

import com.asesoftware.pruebaandres.requests.GenTurnoRequest;
import com.asesoftware.pruebaandres.responses.ComerciosListResponse;
import com.asesoftware.pruebaandres.services.ComerciosService;
import com.asesoftware.pruebaandres.services.GenTurnoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/servicios")
public class ComerciosController {
    @Autowired
    ComerciosService comerciosService;

    @Operation(summary = "Leer Comercios ", description = "Lee todos los Comercios")
    @GetMapping("/comercios")
    public ResponseEntity<ComerciosListResponse> getComercios() {
        return comerciosService.leerComercios();
    }

}
