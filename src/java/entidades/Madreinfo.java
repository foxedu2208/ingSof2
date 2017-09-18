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
@Table(name = "madreinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Madreinfo.findAll", query = "SELECT m FROM Madreinfo m")
    , @NamedQuery(name = "Madreinfo.findById", query = "SELECT m FROM Madreinfo m WHERE m.id = :id")
    , @NamedQuery(name = "Madreinfo.findByNombre", query = "SELECT m FROM Madreinfo m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Madreinfo.findByApellido", query = "SELECT m FROM Madreinfo m WHERE m.apellido = :apellido")
    , @NamedQuery(name = "Madreinfo.findByFechaNacimiento", query = "SELECT m FROM Madreinfo m WHERE m.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Madreinfo.findByLugar", query = "SELECT m FROM Madreinfo m WHERE m.lugar = :lugar")
    , @NamedQuery(name = "Madreinfo.findByCi", query = "SELECT m FROM Madreinfo m WHERE m.ci = :ci")})
public class Madreinfo implements Serializable {

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
    @Column(name = "lugar")
    private String lugar;
    @Size(max = 2147483647)
    @Column(name = "ci")
    private String ci;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuarios idUsuario;

    public Madreinfo() {
    }

    public Madreinfo(Integer id) {
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
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
        if (!(object instanceof Madreinfo)) {
            return false;
        }
        Madreinfo other = (Madreinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Madreinfo[ id=" + id + " ]";
    }
    
}
