package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Estudiante extends Persona{
    @Column(name="codigo",length = 10,nullable = false)
    private String codigo;

    @Column(name="serie",length = 20)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, String codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String nombre, String apellidos, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String serie) {
        super(nombre, apellidos, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
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
