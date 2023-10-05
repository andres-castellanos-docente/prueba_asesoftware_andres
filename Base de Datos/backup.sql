--------------------------------------------------------
--  File created - Thursday-October-05-2023   
--------------------------------------------------------
create user "C##TEST" identified by "oracle";


grant sysdba to "C##TEST";

--------------------------------------------------------
--  DDL for Sequence COMERCIOS_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "C##TEST"."COMERCIOS_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence SERVICIOS_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "C##TEST"."SERVICIOS_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Sequence TURNOS_SEQUENCE
--------------------------------------------------------

   CREATE SEQUENCE  "C##TEST"."TURNOS_SEQUENCE"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1984010 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table COMERCIOS
--------------------------------------------------------

  CREATE TABLE "C##TEST"."COMERCIOS" 
   (	"AFORO_MAXIMO" NUMBER(5,0), 
	"ID_COMERCIO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"NOM_COMERCIO" VARCHAR2(255 CHAR) COLLATE "USING_NLS_COMP"
   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table SERVICIOS
--------------------------------------------------------

  CREATE TABLE "C##TEST"."SERVICIOS" 
   (	"DURACION" NUMBER(5,0), 
	"ID_COMERCIO" NUMBER(10,0), 
	"ID_SERVICIO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"HORA_APERTURA" INTERVAL DAY (2) TO SECOND (6), 
	"HORA_CIERRE" INTERVAL DAY (2) TO SECOND (6), 
	"NOM_SERVICIO" VARCHAR2(255 CHAR) COLLATE "USING_NLS_COMP"
   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TURNOS
--------------------------------------------------------

  CREATE TABLE "C##TEST"."TURNOS" 
   (	"ESTADO" NUMBER(3,0), 
	"FECHA_TURNO" DATE, 
	"ID_SERVICIO" NUMBER(10,0), 
	"ID_TURNO" NUMBER(10,0) GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE , 
	"HORA_FIN" INTERVAL DAY (2) TO SECOND (6), 
	"HORA_INICIO" INTERVAL DAY (2) TO SECOND (6)
   )  DEFAULT COLLATION "USING_NLS_COMP" SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##TEST.COMERCIOS
SET DEFINE OFF;
Insert into C##TEST.COMERCIOS (AFORO_MAXIMO,ID_COMERCIO,NOM_COMERCIO) values ('20','1','Car Center');
Insert into C##TEST.COMERCIOS (AFORO_MAXIMO,ID_COMERCIO,NOM_COMERCIO) values ('8','2','Centro Diseño');
REM INSERTING into C##TEST.SERVICIOS
SET DEFINE OFF;
Insert into C##TEST.SERVICIOS (DURACION,ID_COMERCIO,ID_SERVICIO,HORA_APERTURA,HORA_CIERRE,NOM_SERVICIO) values ('90','1','1','+00 13:00:00.000000','+00 20:00:00.000000','Lavado General');
Insert into C##TEST.SERVICIOS (DURACION,ID_COMERCIO,ID_SERVICIO,HORA_APERTURA,HORA_CIERRE,NOM_SERVICIO) values ('90','2','2','+00 10:00:00.000000','+00 18:00:00.000000','Diseño Cocina');
REM INSERTING into C##TEST.TURNOS
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SYS_C008382
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008382" ON "C##TEST"."COMERCIOS" ("ID_COMERCIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008384
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008384" ON "C##TEST"."SERVICIOS" ("ID_SERVICIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008386
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008386" ON "C##TEST"."TURNOS" ("ID_TURNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TURNOS_SERVICIO_FECHA_HORAS
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."TURNOS_SERVICIO_FECHA_HORAS" ON "C##TEST"."TURNOS" ("FECHA_TURNO", "ID_SERVICIO", "HORA_FIN", "HORA_INICIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008382
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008382" ON "C##TEST"."COMERCIOS" ("ID_COMERCIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008384
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008384" ON "C##TEST"."SERVICIOS" ("ID_SERVICIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index SYS_C008386
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."SYS_C008386" ON "C##TEST"."TURNOS" ("ID_TURNO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index TURNOS_SERVICIO_FECHA_HORAS
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##TEST"."TURNOS_SERVICIO_FECHA_HORAS" ON "C##TEST"."TURNOS" ("FECHA_TURNO", "ID_SERVICIO", "HORA_FIN", "HORA_INICIO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Procedure GEN_TURNOS_SERVICIO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "C##TEST"."GEN_TURNOS_SERVICIO" (
    p_fecha_inicio IN DATE,
    p_fecha_fin    IN DATE,
    p_id_servicio  IN NUMBER,
    p_results      OUT SYS_REFCURSOR
) IS
    intervalo        NUMBER;
    intervalo_string VARCHAR2(10);
    tiempo_act       INTERVAL DAY ( 2 ) TO SECOND ( 6 );
    fecha_act        DATE;
    v_err_code       NUMBER := sqlcode;
    v_err_txt        VARCHAR2(4000) := sqlerrm;
    result_err       VARCHAR2(4000);
    violation_of_constraint EXCEPTION;
BEGIN
    BEGIN
        intervalo_string := 'MINUTE';
        FOR p_params IN (
            SELECT
                id_comercio,
                nom_servicio,
                hora_apertura,
                hora_cierre,
                duracion
            FROM
                servicios
            WHERE
                id_servicio = p_id_servicio
        ) LOOP
            fecha_act := p_fecha_inicio;
            WHILE fecha_act <= p_fecha_fin LOOP
                tiempo_act := p_params.hora_apertura;
                WHILE tiempo_act + numtodsinterval(p_params.duracion, intervalo_string) <= p_params.hora_cierre LOOP
                    BEGIN
                        SAVEPOINT x;
                        INSERT INTO turnos (
                            id_servicio,
                            fecha_turno,
                            hora_inicio,
                            hora_fin
                        ) VALUES (
                            p_id_servicio,
                            fecha_act,
                            tiempo_act,
                            tiempo_act + numtodsinterval(p_params.duracion, intervalo_string)
                        );

                        tiempo_act := tiempo_act + numtodsinterval(p_params.duracion, intervalo_string);
                    EXCEPTION
                        WHEN dup_val_on_index THEN
                            ROLLBACK TO x;
                            COMMIT;
                            RAISE violation_of_constraint;
                    END;
                END LOOP;

                fecha_act := fecha_act + numtodsinterval(1, 'DAY');
            END LOOP;
        END LOOP;
    EXCEPTION
        WHEN violation_of_constraint THEN
            dbms_output.put_line('Value already exists');
            COMMIT;
    END;
    OPEN p_results FOR SELECT c.nom_comercio,
                              s.nom_servicio,t.fecha_turno,t.hora_inicio,t.hora_fin

                                        FROM
                                                 comercios c
                                            INNER JOIN servicios s ON c.id_comercio = s.id_comercio
                                            INNER JOIN turnos    t ON s.id_servicio = t.id_servicio
                      WHERE
                              s.id_servicio = p_id_servicio
                          AND t.fecha_turno BETWEEN p_fecha_inicio AND p_fecha_fin;
                          
  
END;

/
--------------------------------------------------------
--  Constraints for Table COMERCIOS
--------------------------------------------------------

  ALTER TABLE "C##TEST"."COMERCIOS" MODIFY ("ID_COMERCIO" NOT NULL ENABLE);
  ALTER TABLE "C##TEST"."COMERCIOS" ADD PRIMARY KEY ("ID_COMERCIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SERVICIOS
--------------------------------------------------------

  ALTER TABLE "C##TEST"."SERVICIOS" MODIFY ("ID_SERVICIO" NOT NULL ENABLE);
  ALTER TABLE "C##TEST"."SERVICIOS" ADD PRIMARY KEY ("ID_SERVICIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##TEST"."SERVICIOS" MODIFY ("DURACION" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table TURNOS
--------------------------------------------------------

  ALTER TABLE "C##TEST"."TURNOS" MODIFY ("ID_TURNO" NOT NULL ENABLE);
  ALTER TABLE "C##TEST"."TURNOS" ADD PRIMARY KEY ("ID_TURNO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "C##TEST"."TURNOS" ADD CONSTRAINT "TURNOS_SERVICIO_FECHA_HORAS" UNIQUE ("FECHA_TURNO", "ID_SERVICIO", "HORA_FIN", "HORA_INICIO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SERVICIOS
--------------------------------------------------------

  ALTER TABLE "C##TEST"."SERVICIOS" ADD CONSTRAINT "FKC64RNW9LALA5LBFOG949Y748S" FOREIGN KEY ("ID_COMERCIO")
	  REFERENCES "C##TEST"."COMERCIOS" ("ID_COMERCIO") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table TURNOS
--------------------------------------------------------

  ALTER TABLE "C##TEST"."TURNOS" ADD CONSTRAINT "FKLDW5PIG9AQMHUYS63NDTTLMQ1" FOREIGN KEY ("ID_SERVICIO")
	  REFERENCES "C##TEST"."SERVICIOS" ("ID_SERVICIO") ENABLE;
