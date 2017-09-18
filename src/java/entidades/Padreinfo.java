/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "padreinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Padreinfo.findAll", query = "SELECT p FROM Padreinfo p")
    , @NamedQuery(name = "Padreinfo.findById", query = "SELECT p FROM Padreinfo p WHERE p.id = :id")
    , @NamedQuery(name = "Padreinfo.findByNombre", query = "SELECT p FROM Padreinfo p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Padreinfo.findByApellido", query = "SELECT p FROM Padreinfo p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Padreinfo.findByFechaNacimineto", query = "SELECT p FROM Padreinfo p WHERE p.fechaNacimineto = :fechaNacimineto")
    , @NamedQuery(name = "Padreinfo.findByLugarNacimiento", query = "SELECT p FROM Padreinfo p WHERE p.lugarNacimiento = :lugarNacimiento")
    , @NamedQuery(name = "Padreinfo.findByCi", query = "SELECT p FROM Padreinfo p WHERE p.ci = :ci")})
public class Padreinfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimineto")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimineto;
    @Size(max = 2147483647)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Size(max = 2147483647)
    @Column(name = "ci")
    private String ci;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuarios idUsuario;

    public Padreinfo() {
    }

    public Padreinfo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Padreinfo)) {
            return false;
        }
        Padreinfo other = (Padreinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Padreinfo[ id=" + id + " ]";
    }
    
}
