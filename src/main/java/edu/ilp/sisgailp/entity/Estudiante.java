package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona{
    @Column(name="codigo",length = 10,nullable = false)
    private String codigo;

    @Column(name="serie",length = 20)
    private String serie;

   // @ManyToOne
    //@JoinColumn(name="idpersona")
    //private Escuela escuela;

    public Estudiante() {
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
