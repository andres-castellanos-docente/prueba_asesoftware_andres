package com.asesoftware.pruebaandres.entities;

import jakarta.persistence.*;
import java.sql.ResultSet;
import java.util.Date;

@NamedStoredProcedureQueries(
        @NamedStoredProcedureQuery(
                name = "gen_turnos_servicio",
                procedureName = "gen_turnos_servicio",
                resultClasses = StoreProcedureEntity.class,
                parameters = {
                        @StoredProcedureParameter(
                                name = "p_fecha_inicio",
                                type = Date.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "p_fecha_fin",
                                type = Date.class,
                                mode = ParameterMode.IN
                        ),
                        @StoredProcedureParameter(
                                name = "p_id_servicio",
                                type = Integer.class,
                                mode = ParameterMode.IN
                        ),


                        @StoredProcedureParameter(
                                name = "p_results",
                                type = ResultSet.class,
                                mode = ParameterMode.REF_CURSOR
                        )
                }
        )
)
@Entity
public class StoreProcedureEntity
{
    @Id
    @Column(name = "NOM_COMERCIO")
    private String NOM_COMERCIO;

    @Column(name = "NOM_SERVICIO")
    private String NOM_SERVICIO;


    @Column(name = "FECHA_TURNO")
    private String FECHA_TURNO;

    @Column(name = "HORA_INICIO")
    private String HORA_INICIO;

    @Column(name = "HORA_FIN")
    private String HORA_FIN;
}