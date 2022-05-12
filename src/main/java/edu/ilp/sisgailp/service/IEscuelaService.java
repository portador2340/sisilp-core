package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Escuela;

import java.util.List;

public interface IEscuelaService {
    //listar todas las escules
    List<Escuela> listarEscuelas();

//obtener escuela por su codigo
    Escuela obtenerEscuelaPorCodigo(String codigo);

    //buscar una escula atraves de si id y denominacio
    Escuela buscarEscuelaByIdAndDenominacion(Long idescuela,String denominacion);

}
