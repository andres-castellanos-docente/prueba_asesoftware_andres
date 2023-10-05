package com.asesoftware.pruebaandres.entities;

import jakarta.persistence.*;
import oracle.sql.INTERVALDS;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TURNOS",  catalog = "")
public class TurnosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TURNO")
    private Integer idTurno;
    @Basic
    @Column(name = "ID_SERVICIO",insertable=false, updatable=false)
    private Integer idServicio;
    @Basic
    @Column(name = "FECHA_TURNO")
    private Date fechaTurno;
    @Basic
    @Column(name = "ESTADO")
    private byte estado;
    @Basic
    @Column(name = "HORA_INICIO",insertable=false, updatable=false)
    private INTERVALDS horaInicio;
    @Basic
    @Column(name = "HORA_FIN",insertable=false, updatable=false)
    private INTERVALDS horaFin;
    @ManyToOne
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false)
    private ServiciosEntity serviciosByIdServicio;

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    public Object getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(INTERVALDS horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Object getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(INTERVALDS horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TurnosEntity that = (TurnosEntity) o;
        return idTurno == that.idTurno && idServicio == that.idServicio && estado == that.estado && Objects.equals(fechaTurno, that.fechaTurno) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaFin, that.horaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTurno, idServicio, fechaTurno, estado, horaInicio, horaFin);
    }

    public ServiciosEntity getServiciosByIdServicio() {
        return serviciosByIdServicio;
    }

    public void setServiciosByIdServicio(ServiciosEntity serviciosByIdServicio) {
        this.serviciosByIdServicio = serviciosByIdServicio;
    }
}
