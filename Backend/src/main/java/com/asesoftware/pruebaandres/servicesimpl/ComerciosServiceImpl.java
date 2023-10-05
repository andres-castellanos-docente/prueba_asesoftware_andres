package com.asesoftware.pruebaandres.servicesimpl;
import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.entities.StoreProcedureEntity;
import com.asesoftware.pruebaandres.repositories.ComerciosRepository;
import com.asesoftware.pruebaandres.responses.ComercioResponseDto;
import com.asesoftware.pruebaandres.responses.ComerciosListResponse;
import com.asesoftware.pruebaandres.services.ComerciosService;
import com.asesoftware.pruebaandres.services.GenTurnoService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;


@Service
public class ComerciosServiceImpl implements ComerciosService {
    @Autowired
    private ComerciosRepository comerciosRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ResponseEntity<ComerciosListResponse> leerComercios() {
        List<String> listMess = new ArrayList<>();
        listMess.add("Se leyeron correctamente los Comercios");
        List<ComerciosEntity> comercios = comerciosRepository.findAll();

        List<ComercioResponseDto> comerciosDto = new ArrayList<>();
        for (ComerciosEntity com : comercios) {
            comerciosDto.add(new ComercioResponseDto(com));
        }
        return new ResponseEntity<>(new ComerciosListResponse(1, listMess, comerciosDto, HttpStatus.OK.value()), HttpStatus.OK);
    }


    public List<ComerciosEntity> leerComerciosById(Integer idComercio) {
        List<String> listMess = new ArrayList<>();
        listMess.add("Se leyeron correctamente los Comercios");
        List<ComerciosEntity> comercios = comerciosRepository.findByComercio(idComercio);

        List<ComercioResponseDto> comerciosDto = new ArrayList<>();
        for (ComerciosEntity com : comercios) {
            comerciosDto.add(new ComercioResponseDto(com));
        }
        return comercios;
    }


}
