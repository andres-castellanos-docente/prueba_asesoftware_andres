package com.asesoftware.pruebaandres.repositories;

import com.asesoftware.pruebaandres.entities.TurnosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnosRepository extends JpaRepository<TurnosEntity, Integer> {

}
