package com.asesoftware.pruebaandres.repositories;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import com.asesoftware.pruebaandres.entities.ServiciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ServiciosRepository extends JpaRepository<ServiciosEntity, Integer> {
    @Query(
            value = "SELECT s FROM ServiciosEntity s WHERE  s.comerciosByIdComercio = ?1")
    List<ServiciosEntity> findByComercio(ComerciosEntity com);

}
