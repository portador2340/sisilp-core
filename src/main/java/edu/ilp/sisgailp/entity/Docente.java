package edu.ilp.sisgailp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Docente extends Persona{
    @Column(name="codigo_docente",length = 20,nullable = false)
    private String codigoDocente;

    @Column(name="cusros",length = 50)
    private  String cursos;

    public Docente() {
    }

    public Docente(String codigoDocente, String cursos) {
        this.codigoDocente = codigoDocente;
        this.cursos = cursos;
    }

    public Docente(Long idpersona, String codigoDocente, String cursos) {
        super(idpersona);
        this.codigoDocente = codigoDocente;
        this.cursos = cursos;
    }

    public Docente(String nombre, String apellidos, int edad, String dni, Date fechaNacimiento, String genero, String codigoDocente, String cursos) {
        super(nombre, apellidos, edad, dni, fechaNacimiento, genero);
        this.codigoDocente = codigoDocente;
        this.cursos = cursos;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
