package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEscuelaDao extends JpaRepository<Escuela,Long> {
//obtine escueta a traves de su codigo

Escuela findByCodigoEscuela(String codigo);


@Query("SELECT e FROM Escuela e WHERE e.codigoEscuela=?1")
Escuela obtenerEscuelaPorCodigo(String codigo);

@Query("SELECT e FROM Escuela e WHERE e.codigoEscuela = :codigo")
Escuela obtenerEscuelaPorParam(@Param("codigo") String codigo);

//obtiene una escuela a traves de su id y denominacion
    Escuela findByIdescuelaAndDenominacion(Long idescuela,String denominacion);



}
