/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.modelos;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_med_socioeducativa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TMedSocioeducativa.findAll", query = "SELECT t FROM TMedSocioeducativa t")
    , @NamedQuery(name = "TMedSocioeducativa.findByIdMedSocioeducaPk", query = "SELECT t FROM TMedSocioeducativa t WHERE t.idMedSocioeducaPk = :idMedSocioeducaPk")
    , @NamedQuery(name = "TMedSocioeducativa.findByMedSocioeducativa", query = "SELECT t FROM TMedSocioeducativa t WHERE t.medSocioeducativa = :medSocioeducativa")
    , @NamedQuery(name = "TMedSocioeducativa.findByTiempoMeses", query = "SELECT t FROM TMedSocioeducativa t WHERE t.tiempoMeses = :tiempoMeses")
    , @NamedQuery(name = "TMedSocioeducativa.findByTiempoDia", query = "SELECT t FROM TMedSocioeducativa t WHERE t.tiempoDia = :tiempoDia")
    , @NamedQuery(name = "TMedSocioeducativa.findByTiempoHoras", query = "SELECT t FROM TMedSocioeducativa t WHERE t.tiempoHoras = :tiempoHoras")
    , @NamedQuery(name = "TMedSocioeducativa.findByCumplioMedida", query = "SELECT t FROM TMedSocioeducativa t WHERE t.cumplioMedida = :cumplioMedida")
    , @NamedQuery(name = "TMedSocioeducativa.findByFechaFinMedida", query = "SELECT t FROM TMedSocioeducativa t WHERE t.fechaFinMedida = :fechaFinMedida")
    , @NamedQuery(name = "TMedSocioeducativa.findByInstEjecutoraMed", query = "SELECT t FROM TMedSocioeducativa t WHERE t.instEjecutoraMed = :instEjecutoraMed")})
public class TMedSocioeducativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_med_socioeduca_pk")
    private Integer idMedSocioeducaPk;
    @Size(max = 50)
    @Column(name = "med_socioeducativa")
    private String medSocioeducativa;
    @Column(name = "tiempo_meses")
    private Integer tiempoMeses;
    @Column(name = "tiempo_dia")
    private Integer tiempoDia;
    @Column(name = "tiempo_horas")
    private Integer tiempoHoras;
    @Column(name = "cumplio_medida")
    private Boolean cumplioMedida;
    @Column(name = "fecha_fin_medida")
    @Temporal(TemporalType.DATE)
    private Date fechaFinMedida;
    @Size(max = 50)
    @Column(name = "inst_ejecutora_med")
    private String instEjecutoraMed;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TMedSocioeducativa() {
    }

    public TMedSocioeducativa(Integer idMedSocioeducaPk) {
        this.idMedSocioeducaPk = idMedSocioeducaPk;
    }

    public Integer getIdMedSocioeducaPk() {
        return idMedSocioeducaPk;
    }

    public void setIdMedSocioeducaPk(Integer idMedSocioeducaPk) {
        this.idMedSocioeducaPk = idMedSocioeducaPk;
    }

    public String getMedSocioeducativa() {
        return medSocioeducativa;
    }

    public void setMedSocioeducativa(String medSocioeducativa) {
        this.medSocioeducativa = medSocioeducativa;
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

    public Integer getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(Integer tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    public Boolean getCumplioMedida() {
        return cumplioMedida;
    }

    public void setCumplioMedida(Boolean cumplioMedida) {
        this.cumplioMedida = cumplioMedida;
    }

    public Date getFechaFinMedida() {
        return fechaFinMedida;
    }

    public void setFechaFinMedida(Date fechaFinMedida) {
        this.fechaFinMedida = fechaFinMedida;
    }

    public String getInstEjecutoraMed() {
        return instEjecutoraMed;
    }

    public void setInstEjecutoraMed(String instEjecutoraMed) {
        this.instEjecutoraMed = instEjecutoraMed;
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
        hash += (idMedSocioeducaPk != null ? idMedSocioeducaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TMedSocioeducativa)) {
            return false;
        }
        TMedSocioeducativa other = (TMedSocioeducativa) object;
        if ((this.idMedSocioeducaPk == null && other.idMedSocioeducaPk != null) || (this.idMedSocioeducaPk != null && !this.idMedSocioeducaPk.equals(other.idMedSocioeducaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TMedSocioeducativa[ idMedSocioeducaPk=" + idMedSocioeducaPk + " ]";
    }
    
}
