/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "vacunasinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacunasinfo.findAll", query = "SELECT v FROM Vacunasinfo v")
    , @NamedQuery(name = "Vacunasinfo.findById", query = "SELECT v FROM Vacunasinfo v WHERE v.id = :id")
    , @NamedQuery(name = "Vacunasinfo.findByNombre", query = "SELECT v FROM Vacunasinfo v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Vacunasinfo.findByPreviene", query = "SELECT v FROM Vacunasinfo v WHERE v.previene = :previene")
    , @NamedQuery(name = "Vacunasinfo.findByDesde", query = "SELECT v FROM Vacunasinfo v WHERE v.desde = :desde")
    , @NamedQuery(name = "Vacunasinfo.findByHasta", query = "SELECT v FROM Vacunasinfo v WHERE v.hasta = :hasta")})
public class Vacunasinfo implements Serializable {

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
    @Column(name = "previene")
    private String previene;
    @Column(name = "desde")
    private Integer desde;
    @Column(name = "hasta")
    private Integer hasta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vacunasinfo")
    private Collection<Libreta> libretaCollection;

    public Vacunasinfo() {
    }

    public Vacunasinfo(Integer id) {
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

    public String getPreviene() {
        return previene;
    }

    public void setPreviene(String previene) {
        this.previene = previene;
    }

    public Integer getDesde() {
        return desde;
    }

    public void setDesde(Integer desde) {
        this.desde = desde;
    }

    public Integer getHasta() {
        return hasta;
    }

    public void setHasta(Integer hasta) {
        this.hasta = hasta;
    }

    @XmlTransient
    public Collection<Libreta> getLibretaCollection() {
        return libretaCollection;
    }

    public void setLibretaCollection(Collection<Libreta> libretaCollection) {
        this.libretaCollection = libretaCollection;
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
        if (!(object instanceof Vacunasinfo)) {
            return false;
        }
        Vacunasinfo other = (Vacunasinfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Vacunasinfo[ id=" + id + " ]";
    }
    
}
