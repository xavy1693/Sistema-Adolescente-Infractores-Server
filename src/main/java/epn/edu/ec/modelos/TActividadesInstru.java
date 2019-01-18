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
@Table(name = "t_actividades_instru")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TActividadesInstru.findAll", query = "SELECT t FROM TActividadesInstru t")
    , @NamedQuery(name = "TActividadesInstru.findByIdActividadInstPk", query = "SELECT t FROM TActividadesInstru t WHERE t.idActividadInstPk = :idActividadInstPk")
    , @NamedQuery(name = "TActividadesInstru.findByPlanEjecucionMed", query = "SELECT t FROM TActividadesInstru t WHERE t.planEjecucionMed = :planEjecucionMed")
    , @NamedQuery(name = "TActividadesInstru.findByPlanGlobalFamilia", query = "SELECT t FROM TActividadesInstru t WHERE t.planGlobalFamilia = :planGlobalFamilia")
    , @NamedQuery(name = "TActividadesInstru.findByPlanVida", query = "SELECT t FROM TActividadesInstru t WHERE t.planVida = :planVida")
    , @NamedQuery(name = "TActividadesInstru.findByPlanIndAplicMed", query = "SELECT t FROM TActividadesInstru t WHERE t.planIndAplicMed = :planIndAplicMed")})
public class TActividadesInstru implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad_inst_pk")
    private Integer idActividadInstPk;
    @Column(name = "plan_ejecucion_med")
    private Boolean planEjecucionMed;
    @Column(name = "plan_global_familia")
    private Boolean planGlobalFamilia;
    @Column(name = "plan_vida")
    private Boolean planVida;
    @Column(name = "plan_ind_aplic_med")
    private Boolean planIndAplicMed;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TActividadesInstru() {
    }

    public TActividadesInstru(Integer idActividadInstPk) {
        this.idActividadInstPk = idActividadInstPk;
    }

    public Integer getIdActividadInstPk() {
        return idActividadInstPk;
    }

    public void setIdActividadInstPk(Integer idActividadInstPk) {
        this.idActividadInstPk = idActividadInstPk;
    }

    public Boolean getPlanEjecucionMed() {
        return planEjecucionMed;
    }

    public void setPlanEjecucionMed(Boolean planEjecucionMed) {
        this.planEjecucionMed = planEjecucionMed;
    }

    public Boolean getPlanGlobalFamilia() {
        return planGlobalFamilia;
    }

    public void setPlanGlobalFamilia(Boolean planGlobalFamilia) {
        this.planGlobalFamilia = planGlobalFamilia;
    }

    public Boolean getPlanVida() {
        return planVida;
    }

    public void setPlanVida(Boolean planVida) {
        this.planVida = planVida;
    }

    public Boolean getPlanIndAplicMed() {
        return planIndAplicMed;
    }

    public void setPlanIndAplicMed(Boolean planIndAplicMed) {
        this.planIndAplicMed = planIndAplicMed;
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
        hash += (idActividadInstPk != null ? idActividadInstPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TActividadesInstru)) {
            return false;
        }
        TActividadesInstru other = (TActividadesInstru) object;
        if ((this.idActividadInstPk == null && other.idActividadInstPk != null) || (this.idActividadInstPk != null && !this.idActividadInstPk.equals(other.idActividadInstPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TActividadesInstru[ idActividadInstPk=" + idActividadInstPk + " ]";
    }
    
}
