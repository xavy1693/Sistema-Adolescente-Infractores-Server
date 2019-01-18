/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_unidad_zonal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUnidadZonal.findAll", query = "SELECT t FROM TUnidadZonal t")
    , @NamedQuery(name = "TUnidadZonal.findByIdUnidadZonal", query = "SELECT t FROM TUnidadZonal t WHERE t.idUnidadZonal = :idUnidadZonal")
    , @NamedQuery(name = "TUnidadZonal.findByUnidadZonal", query = "SELECT t FROM TUnidadZonal t WHERE t.unidadZonal = :unidadZonal")
    , @NamedQuery(name = "TUnidadZonal.findByNumExpediente", query = "SELECT t FROM TUnidadZonal t WHERE t.numExpediente = :numExpediente")})
public class TUnidadZonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_unidad_zonal")
    private Integer idUnidadZonal;
    @Size(max = 7)
    @Column(name = "unidad_zonal")
    private String unidadZonal;
    @Size(max = 10)
    @Column(name = "num_expediente")
    private String numExpediente;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TUnidadZonal() {
    }

    public TUnidadZonal(Integer idUnidadZonal) {
        this.idUnidadZonal = idUnidadZonal;
    }

    public Integer getIdUnidadZonal() {
        return idUnidadZonal;
    }

    public void setIdUnidadZonal(Integer idUnidadZonal) {
        this.idUnidadZonal = idUnidadZonal;
    }

    public String getUnidadZonal() {
        return unidadZonal;
    }

    public void setUnidadZonal(String unidadZonal) {
        this.unidadZonal = unidadZonal;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public TAdolescenteInfract getIdAdolescenteFk() {
        return idAdolescenteFk;
    }

    public void setIdAdolescenteFk(TAdolescenteInfract idAdolescenteFk) {
        this.idAdolescenteFk = idAdolescenteFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadZonal != null ? idUnidadZonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUnidadZonal)) {
            return false;
        }
        TUnidadZonal other = (TUnidadZonal) object;
        if ((this.idUnidadZonal == null && other.idUnidadZonal != null) || (this.idUnidadZonal != null && !this.idUnidadZonal.equals(other.idUnidadZonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TUnidadZonal[ idUnidadZonal=" + idUnidadZonal + " ]";
    }
    
}
