package com.asesoftware.pruebaandres.services;

import com.asesoftware.pruebaandres.entities.StoreProcedureEntity;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GenTurnoService {
    ArrayList<Map<String, String>> GenTurnService(Date fecha_ini, Date fecha_fin, Integer id_servicio) throws ParseException;
}
