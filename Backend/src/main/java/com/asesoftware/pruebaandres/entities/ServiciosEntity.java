package com.asesoftware.pruebaandres.entities;

import jakarta.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "SERVICIOS",  catalog = "")
public class ServiciosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_SERVICIO")
    private Integer idServicio;
    @Basic
    @Column(name = "ID_COMERCIO",insertable=false, updatable=false)
    private Integer idComercio;
    @Basic
    @Column(name = "NOM_SERVICIO")
    private String nomServicio;
    @Basic
    @Column(name = "DURACION")
    private short duracion;
    @Basic
    @Column(name = "HORA_APERTURA",insertable=false, updatable=false)
    private String horaApertura;
    @Basic
    @Column(name = "HORA_CIERRE",insertable=false, updatable=false)
    private String horaCierre;
    @ManyToOne
    @JoinColumn(name = "ID_COMERCIO", referencedColumnName = "ID_COMERCIO", nullable = false)
    private ComerciosEntity comerciosByIdComercio;
    @OneToMany(mappedBy = "serviciosByIdServicio")
    private Collection<TurnosEntity> turnosByIdServicio;

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Integer getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(Integer idComercio) {
        this.idComercio = idComercio;
    }

    public String getNomServicio() {
        return nomServicio;
    }

    public void setNomServicio(String nomServicio) {
        this.nomServicio = nomServicio;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Object getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiciosEntity that = (ServiciosEntity) o;
        return idServicio == that.idServicio && idComercio == that.idComercio && duracion == that.duracion && Objects.equals(nomServicio, that.nomServicio) && Objects.equals(horaApertura, that.horaApertura) && Objects.equals(horaCierre, that.horaCierre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServicio, idComercio, nomServicio, duracion, horaApertura, horaCierre);
    }

    public ComerciosEntity getComerciosByIdComercio() {
        return comerciosByIdComercio;
    }

    public void setComerciosByIdComercio(ComerciosEntity comerciosByIdComercio) {
        this.comerciosByIdComercio = comerciosByIdComercio;
    }

    public Collection<TurnosEntity> getTurnosByIdServicio() {
        return turnosByIdServicio;
    }

    public void setTurnosByIdServicio(Collection<TurnosEntity> turnosByIdServicio) {
        this.turnosByIdServicio = turnosByIdServicio;
    }
}
