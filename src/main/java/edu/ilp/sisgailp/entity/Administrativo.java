package edu.ilp.sisgailp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Administrativo extends Persona{
    @Column(name="codAmin",length = 50,nullable = false)
    private String codAdmin;

    @Column(name="cargo",length = 20)
    private String cargo;

    public Administrativo() {
    }

    public Administrativo(String codAdmin, String cargo) {
        this.codAdmin = codAdmin;
        this.cargo = cargo;
    }

    public Administrativo(Long idpersona, String codAdmin, String cargo) {
        super(idpersona);
        this.codAdmin = codAdmin;
        this.cargo = cargo;
    }

    public Administrativo(String nombre, String apellidos, int edad, String dni, Date fechaNacimiento, String genero, String codAdmin, String cargo) {
        super(nombre, apellidos, edad, dni, fechaNacimiento, genero);
        this.codAdmin = codAdmin;
        this.cargo = cargo;
    }

    public String getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
