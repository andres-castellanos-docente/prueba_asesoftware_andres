package com.asesoftware.pruebaandres.controllers;

import com.asesoftware.pruebaandres.entities.StoreProcedureEntity;
import com.asesoftware.pruebaandres.requests.GenTurnoRequest;
import com.asesoftware.pruebaandres.services.GenTurnoService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/servicios")
public class GenTurnoController {
    @Autowired
    GenTurnoService genTurnoService;

    @Operation(summary = "Crear Turnos", description = "Crea turnos")
    @PostMapping("/turnos")
    public ArrayList<Map<String, String>> genTurnos(@RequestBody GenTurnoRequest genTurnoRequest) {
        try {
            ArrayList<Map<String, String>> lista = genTurnoService.GenTurnService(new SimpleDateFormat("dd/MM/yyyy").parse(genTurnoRequest.getFecha_ini()), new SimpleDateFormat("dd/MM/yyyy").parse(genTurnoRequest.getFecha_fin()), genTurnoRequest.getId_servicio());
            return  lista;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
