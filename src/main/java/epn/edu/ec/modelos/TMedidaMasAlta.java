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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_medida_mas_alta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMedidaMasAlta.findAll", query = "SELECT t FROM TMedidaMasAlta t")
    , @NamedQuery(name = "TMedidaMasAlta.findByIdMedidaAltaPk", query = "SELECT t FROM TMedidaMasAlta t WHERE t.idMedidaAltaPk = :idMedidaAltaPk")
    , @NamedQuery(name = "TMedidaMasAlta.findByMedidaMasAlta", query = "SELECT t FROM TMedidaMasAlta t WHERE t.medidaMasAlta = :medidaMasAlta")
    , @NamedQuery(name = "TMedidaMasAlta.findByTiempoMeses", query = "SELECT t FROM TMedidaMasAlta t WHERE t.tiempoMeses = :tiempoMeses")
    , @NamedQuery(name = "TMedidaMasAlta.findByTiempoDia", query = "SELECT t FROM TMedidaMasAlta t WHERE t.tiempoDia = :tiempoDia")})
public class TMedidaMasAlta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medida_alta_pk")
    private Integer idMedidaAltaPk;
    @Column(name = "medida_mas_alta")
    private Integer medidaMasAlta;
    @Column(name = "tiempo_meses")
    private Integer tiempoMeses;
    @Column(name = "tiempo_dia")
    private Integer tiempoDia;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TMedidaMasAlta() {
    }

    public TMedidaMasAlta(Integer idMedidaAltaPk) {
        this.idMedidaAltaPk = idMedidaAltaPk;
    }

    public Integer getIdMedidaAltaPk() {
        return idMedidaAltaPk;
    }

    public void setIdMedidaAltaPk(Integer idMedidaAltaPk) {
        this.idMedidaAltaPk = idMedidaAltaPk;
    }

    public Integer getMedidaMasAlta() {
        return medidaMasAlta;
    }

    public void setMedidaMasAlta(Integer medidaMasAlta) {
        this.medidaMasAlta = medidaMasAlta;
    }

    public Integer getTiempoMeses() {
        return tiempoMeses;
    }

    public void setTiempoMeses(Integer tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public Integer getTiempoDia() {
        return tiempoDia;
    }

    public void setTiempoDia(Integer tiempoDia) {
        this.tiempoDia = tiempoDia;
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
        hash += (idMedidaAltaPk != null ? idMedidaAltaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMedidaMasAlta)) {
            return false;
        }
        TMedidaMasAlta other = (TMedidaMasAlta) object;
        if ((this.idMedidaAltaPk == null && other.idMedidaAltaPk != null) || (this.idMedidaAltaPk != null && !this.idMedidaAltaPk.equals(other.idMedidaAltaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TMedidaMasAlta[ idMedidaAltaPk=" + idMedidaAltaPk + " ]";
    }
    
}
