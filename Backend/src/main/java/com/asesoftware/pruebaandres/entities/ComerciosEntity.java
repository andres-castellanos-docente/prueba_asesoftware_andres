package com.asesoftware.pruebaandres.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "COMERCIOS",  catalog = "")
public class ComerciosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_COMERCIO")
    private Integer idComercio;
    @Basic
    @Column(name = "NOM_COMERCIO")
    private String nomComercio;
    @Basic
    @Column(name = "AFORO_MAXIMO")
    private Short aforoMaximo;
    @OneToMany(mappedBy = "comerciosByIdComercio")
    private Collection<ServiciosEntity> serviciosByIdComercio;

    public Integer getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(Integer idComercio) {
        this.idComercio = idComercio;
    }

    public String getNomComercio() {
        return nomComercio;
    }

    public void setNomComercio(String nomComercio) {
        this.nomComercio = nomComercio;
    }

    public Short getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(Short aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComerciosEntity that = (ComerciosEntity) o;
        return idComercio == that.idComercio && Objects.equals(nomComercio, that.nomComercio) && Objects.equals(aforoMaximo, that.aforoMaximo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComercio, nomComercio, aforoMaximo);
    }

    public Collection<ServiciosEntity> getServiciosByIdComercio() {
        return serviciosByIdComercio;
    }

    public void setServiciosByIdComercio(Collection<ServiciosEntity> serviciosByIdComercio) {
        this.serviciosByIdComercio = serviciosByIdComercio;
    }
}
