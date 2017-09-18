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
@Table(name = "tutorinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tutorinfo.findAll", query = "SELECT t FROM Tutorinfo t")
    , @NamedQuery(name = "Tutorinfo.findById", query = "SELECT t FROM Tutorinfo t WHERE t.id = :id")
    , @NamedQuery(name = "Tutorinfo.findByNombre", query = "SELECT t FROM Tutorinfo t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tutorinfo.findByApellido", query = "SELECT t FROM Tutorinfo t WHERE t.apellido = :apellido")
    , @NamedQuery(name = "Tutorinfo.findByFechaNacimiento", query = "SELECT t FROM Tutorinfo t WHERE t.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Tutorinfo.findByLugarNacimiento", query = "SELECT t FROM Tutorinfo t WHERE t.lugarNacimiento = :lugarNacimiento")
    , @NamedQuery(name = "Tutorinfo.findByCi", query = "SELECT t FROM Tutorinfo t WHERE t.ci = :ci")})
public class Tutorinfo implements Serializable {

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
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Size(max = 2147483647)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Size(max = 2147483647)
    @Column(name = "ci")
    private String ci;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuarios idUsuario;

    public Tutorinfo() {
    }

    public Tutorinfo(Integer id) {
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
        if (!(object instanceof Tutorinfo)) {
            return false;
        }
        Tutorinfo other = (Tutorinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tutorinfo[ id=" + id + " ]";
    }
    
}
