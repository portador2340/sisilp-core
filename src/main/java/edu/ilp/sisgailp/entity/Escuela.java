package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="escuela")
public class Escuela {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idescuela;
    private String denominacion;
    private  String  codigoescuela;



    @OneToMany(mappedBy = "escuela")
 private List<Estudiante> estudiantes;

    public Escuela() {
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public Escuela(Long idescuela, String denominacion, String codigoescuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoescuela = codigoescuela;
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigoescuela() {
        return codigoescuela;
    }

    public void setCodigoescuela(String codigoescuela) {
        this.codigoescuela = codigoescuela;
    }
}
