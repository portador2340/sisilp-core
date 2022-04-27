package edu.ilp.sisgailp.entity;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona",length = 10)
    private Long idpersona;

    @Column(name="nombre",length = 50,nullable = false)
    private String nombre;

    private String apellidos;
    private int edad;
    private String dni;

    @Column(name="fecha_nacimiento",length = 50)
    private Date fechaNacimiento;

    private String genero;

    public Persona() {
    }

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona(String nombre, String apellidos, int edad, String dni, Date fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
