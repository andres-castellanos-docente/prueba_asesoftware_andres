package com.asesoftware.pruebaandres.servicesimpl;
import com.asesoftware.pruebaandres.entities.StoreProcedureEntity;
import com.asesoftware.pruebaandres.services.GenTurnoService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.*;


@Service
public class GenTurnoServiceImpl implements GenTurnoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ArrayList<Map<String, String>> GenTurnService(Date fecha_ini, Date fecha_fin, Integer id_servicio) throws ParseException {
        List<StoreProcedureEntity> lista_procedure = this.entityManager.createNamedStoredProcedureQuery("gen_turnos_servicio")
                .setParameter("p_fecha_inicio", fecha_ini)
                .setParameter("p_fecha_fin", fecha_fin)
                .setParameter("p_id_servicio", id_servicio)
                .getResultList();
        Gson gson = new Gson();
        String data_gson = gson.toJson(lista_procedure);
        ArrayList<Map<String, String>> lista_procedure_json = gson.fromJson(data_gson,
                new TypeToken<ArrayList<HashMap<String, String>>>() {
                }.getType());

        return lista_procedure_json;
    }
}
