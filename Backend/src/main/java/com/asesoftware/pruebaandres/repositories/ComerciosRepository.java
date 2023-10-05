package com.asesoftware.pruebaandres.repositories;

import com.asesoftware.pruebaandres.entities.ComerciosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComerciosRepository extends JpaRepository<ComerciosEntity, Integer> {
    @Query(
            value = "SELECT c FROM ComerciosEntity c WHERE  c.idComercio = ?1")
    List<ComerciosEntity> findByComercio(Integer idComercio);
}
