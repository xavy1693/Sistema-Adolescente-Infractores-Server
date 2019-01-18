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
@Table(name = "t_info_infraccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TInfoInfraccion.findAll", query = "SELECT t FROM TInfoInfraccion t")
    , @NamedQuery(name = "TInfoInfraccion.findByIdInfoInfracPk", query = "SELECT t FROM TInfoInfraccion t WHERE t.idInfoInfracPk = :idInfoInfracPk")
    , @NamedQuery(name = "TInfoInfraccion.findByProvinciaDetencion", query = "SELECT t FROM TInfoInfraccion t WHERE t.provinciaDetencion = :provinciaDetencion")
    , @NamedQuery(name = "TInfoInfraccion.findByCantonDetencion", query = "SELECT t FROM TInfoInfraccion t WHERE t.cantonDetencion = :cantonDetencion")
    , @NamedQuery(name = "TInfoInfraccion.findByTipoInfraccion", query = "SELECT t FROM TInfoInfraccion t WHERE t.tipoInfraccion = :tipoInfraccion")})
public class TInfoInfraccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_info_infrac_pk")
    private Integer idInfoInfracPk;
    @Size(max = 50)
    @Column(name = "provincia_detencion")
    private String provinciaDetencion;
    @Size(max = 50)
    @Column(name = "canton_detencion")
    private String cantonDetencion;
    @Size(max = 200)
    @Column(name = "tipo_infraccion")
    private String tipoInfraccion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TInfoInfraccion() {
    }

    public TInfoInfraccion(Integer idInfoInfracPk) {
        this.idInfoInfracPk = idInfoInfracPk;
    }

    public Integer getIdInfoInfracPk() {
        return idInfoInfracPk;
    }

    public void setIdInfoInfracPk(Integer idInfoInfracPk) {
        this.idInfoInfracPk = idInfoInfracPk;
    }

    public String getProvinciaDetencion() {
        return provinciaDetencion;
    }

    public void setProvinciaDetencion(String provinciaDetencion) {
        this.provinciaDetencion = provinciaDetencion;
    }

    public String getCantonDetencion() {
        return cantonDetencion;
    }

    public void setCantonDetencion(String cantonDetencion) {
        this.cantonDetencion = cantonDetencion;
    }

    public String getTipoInfraccion() {
        return tipoInfraccion;
    }

    public void setTipoInfraccion(String tipoInfraccion) {
        this.tipoInfraccion = tipoInfraccion;
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
        hash += (idInfoInfracPk != null ? idInfoInfracPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TInfoInfraccion)) {
            return false;
        }
        TInfoInfraccion other = (TInfoInfraccion) object;
        if ((this.idInfoInfracPk == null && other.idInfoInfracPk != null) || (this.idInfoInfracPk != null && !this.idInfoInfracPk.equals(other.idInfoInfracPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TInfoInfraccion[ idInfoInfracPk=" + idInfoInfracPk + " ]";
    }
    
}
