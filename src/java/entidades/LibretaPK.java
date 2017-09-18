/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Acer
 */
@Embeddable
public class LibretaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idvacuna")
    private int idvacuna;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhijo")
    private int idhijo;

    public LibretaPK() {
    }

    public LibretaPK(int idvacuna, int idhijo) {
        this.idvacuna = idvacuna;
        this.idhijo = idhijo;
    }

    public int getIdvacuna() {
        return idvacuna;
    }

    public void setIdvacuna(int idvacuna) {
        this.idvacuna = idvacuna;
    }

    public int getIdhijo() {
        return idhijo;
    }

    public void setIdhijo(int idhijo) {
        this.idhijo = idhijo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idvacuna;
        hash += (int) idhijo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibretaPK)) {
            return false;
        }
        LibretaPK other = (LibretaPK) object;
        if (this.idvacuna != other.idvacuna) {
            return false;
        }
        if (this.idhijo != other.idhijo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.LibretaPK[ idvacuna=" + idvacuna + ", idhijo=" + idhijo + " ]";
    }
    
}
