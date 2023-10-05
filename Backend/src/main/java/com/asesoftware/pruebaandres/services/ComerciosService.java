package com.asesoftware.pruebaandres.services;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.responses.ComerciosListResponse;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface ComerciosService {
    ResponseEntity<ComerciosListResponse> leerComercios();
    List<ComerciosEntity> leerComerciosById(Integer idComercio);
}
