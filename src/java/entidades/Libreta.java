/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "libreta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libreta.findAll", query = "SELECT l FROM Libreta l")
    , @NamedQuery(name = "Libreta.findByIdvacuna", query = "SELECT l FROM Libreta l WHERE l.libretaPK.idvacuna = :idvacuna")
    , @NamedQuery(name = "Libreta.findByIdhijo", query = "SELECT l FROM Libreta l WHERE l.libretaPK.idhijo = :idhijo")
    , @NamedQuery(name = "Libreta.findByAplicado", query = "SELECT l FROM Libreta l WHERE l.aplicado = :aplicado")})
public class Libreta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LibretaPK libretaPK;
    @Column(name = "aplicado")
    private Character aplicado;
    @JoinColumn(name = "idhijo", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hijos hijos;
    @JoinColumn(name = "idvacuna", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vacunasinfo vacunasinfo;

    public Libreta() {
    }

    public Libreta(LibretaPK libretaPK) {
        this.libretaPK = libretaPK;
    }

    public Libreta(int idvacuna, int idhijo) {
        this.libretaPK = new LibretaPK(idvacuna, idhijo);
    }

    public LibretaPK getLibretaPK() {
        return libretaPK;
    }

    public void setLibretaPK(LibretaPK libretaPK) {
        this.libretaPK = libretaPK;
    }

    public Character getAplicado() {
        return aplicado;
    }

    public void setAplicado(Character aplicado) {
        this.aplicado = aplicado;
    }

    public Hijos getHijos() {
        return hijos;
    }

    public void setHijos(Hijos hijos) {
        this.hijos = hijos;
    }

    public Vacunasinfo getVacunasinfo() {
        return vacunasinfo;
    }

    public void setVacunasinfo(Vacunasinfo vacunasinfo) {
        this.vacunasinfo = vacunasinfo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libretaPK != null ? libretaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libreta)) {
            return false;
        }
        Libreta other = (Libreta) object;
        if ((this.libretaPK == null && other.libretaPK != null) || (this.libretaPK != null && !this.libretaPK.equals(other.libretaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Libreta[ libretaPK=" + libretaPK + " ]";
    }
    
}
