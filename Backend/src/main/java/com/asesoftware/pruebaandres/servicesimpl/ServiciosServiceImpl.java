package com.asesoftware.pruebaandres.servicesimpl;


import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.entities.ServiciosEntity;
import com.asesoftware.pruebaandres.repositories.ServiciosRepository;
import com.asesoftware.pruebaandres.responses.ServicioResponseDto;
import com.asesoftware.pruebaandres.responses.ServiciosListResponse;
import com.asesoftware.pruebaandres.services.ServiciosService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiciosServiceImpl implements ServiciosService {
    @Autowired
    private ServiciosRepository serviciosRepository;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ResponseEntity<ServiciosListResponse> leerServicios() {
        List<String> listMess = new ArrayList<>();
        listMess.add("Se leyeron correctamente los Servicios");
        List<ServiciosEntity> servicios = serviciosRepository.findAll();

        List<ServicioResponseDto> serviciosDto = new ArrayList<>();
        for (ServiciosEntity serv : servicios) {
            serviciosDto.add(new ServicioResponseDto(serv));
        }
        return new ResponseEntity<>(new ServiciosListResponse(1, listMess, serviciosDto, HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<ServiciosListResponse> leerServiciosByComercio(ComerciosEntity com) {
        List<String> listMess = new ArrayList<>();
        listMess.add("Se leyeron correctamente los Servicios del comercio: "+ com.getNomComercio());
        List<ServiciosEntity> servicios = serviciosRepository.findByComercio(com);

        List<ServicioResponseDto> serviciosDto = new ArrayList<>();
        for (ServiciosEntity serv : servicios) {
            serviciosDto.add(new ServicioResponseDto(serv));
        }
        return new ResponseEntity<>(new ServiciosListResponse(1, listMess, serviciosDto, HttpStatus.OK.value()), HttpStatus.OK);
    }
}
