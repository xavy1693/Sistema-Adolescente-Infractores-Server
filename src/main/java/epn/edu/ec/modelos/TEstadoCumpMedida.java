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
@Table(name = "t_estado_cump_medida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEstadoCumpMedida.findAll", query = "SELECT t FROM TEstadoCumpMedida t")
    , @NamedQuery(name = "TEstadoCumpMedida.findByIdEstadCumpMedPk", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.idEstadCumpMedPk = :idEstadCumpMedPk")
    , @NamedQuery(name = "TEstadoCumpMedida.findBySituacionActual", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.situacionActual = :situacionActual")
    , @NamedQuery(name = "TEstadoCumpMedida.findByFechaReportCulmin", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.fechaReportCulmin = :fechaReportCulmin")
    , @NamedQuery(name = "TEstadoCumpMedida.findByFechaReportDerivac", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.fechaReportDerivac = :fechaReportDerivac")
    , @NamedQuery(name = "TEstadoCumpMedida.findByUzdiReceptDeriva", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.uzdiReceptDeriva = :uzdiReceptDeriva")
    , @NamedQuery(name = "TEstadoCumpMedida.findByFechaReportIncump", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.fechaReportIncump = :fechaReportIncump")
    , @NamedQuery(name = "TEstadoCumpMedida.findByEstadoIncump", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.estadoIncump = :estadoIncump")
    , @NamedQuery(name = "TEstadoCumpMedida.findByReanudacionMed", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.reanudacionMed = :reanudacionMed")
    , @NamedQuery(name = "TEstadoCumpMedida.findByFechaReanudacion", query = "SELECT t FROM TEstadoCumpMedida t WHERE t.fechaReanudacion = :fechaReanudacion")})
public class TEstadoCumpMedida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estad_cump_med_pk")
    private Integer idEstadCumpMedPk;
    @Size(max = 20)
    @Column(name = "situacion_actual")
    private String situacionActual;
    @Column(name = "fecha_report_culmin")
    @Temporal(TemporalType.DATE)
    private Date fechaReportCulmin;
    @Column(name = "fecha_report_derivac")
    @Temporal(TemporalType.DATE)
    private Date fechaReportDerivac;
    @Size(max = 7)
    @Column(name = "uzdi_recept_deriva")
    private String uzdiReceptDeriva;
    @Column(name = "fecha_report_incump")
    @Temporal(TemporalType.DATE)
    private Date fechaReportIncump;
    @Size(max = 20)
    @Column(name = "estado_incump")
    private String estadoIncump;
    @Column(name = "reanudacion_med")
    private Boolean reanudacionMed;
    @Column(name = "fecha_reanudacion")
    @Temporal(TemporalType.DATE)
    private Date fechaReanudacion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TEstadoCumpMedida() {
    }

    public TEstadoCumpMedida(Integer idEstadCumpMedPk) {
        this.idEstadCumpMedPk = idEstadCumpMedPk;
    }

    public Integer getIdEstadCumpMedPk() {
        return idEstadCumpMedPk;
    }

    public void setIdEstadCumpMedPk(Integer idEstadCumpMedPk) {
        this.idEstadCumpMedPk = idEstadCumpMedPk;
    }

    public String getSituacionActual() {
        return situacionActual;
    }

    public void setSituacionActual(String situacionActual) {
        this.situacionActual = situacionActual;
    }

    public Date getFechaReportCulmin() {
        return fechaReportCulmin;
    }

    public void setFechaReportCulmin(Date fechaReportCulmin) {
        this.fechaReportCulmin = fechaReportCulmin;
    }

    public Date getFechaReportDerivac() {
        return fechaReportDerivac;
    }

    public void setFechaReportDerivac(Date fechaReportDerivac) {
        this.fechaReportDerivac = fechaReportDerivac;
    }

    public String getUzdiReceptDeriva() {
        return uzdiReceptDeriva;
    }

    public void setUzdiReceptDeriva(String uzdiReceptDeriva) {
        this.uzdiReceptDeriva = uzdiReceptDeriva;
    }

    public Date getFechaReportIncump() {
        return fechaReportIncump;
    }

    public void setFechaReportIncump(Date fechaReportIncump) {
        this.fechaReportIncump = fechaReportIncump;
    }

    public String getEstadoIncump() {
        return estadoIncump;
    }

    public void setEstadoIncump(String estadoIncump) {
        this.estadoIncump = estadoIncump;
    }

    public Boolean getReanudacionMed() {
        return reanudacionMed;
    }

    public void setReanudacionMed(Boolean reanudacionMed) {
        this.reanudacionMed = reanudacionMed;
    }

    public Date getFechaReanudacion() {
        return fechaReanudacion;
    }

    public void setFechaReanudacion(Date fechaReanudacion) {
        this.fechaReanudacion = fechaReanudacion;
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
        hash += (idEstadCumpMedPk != null ? idEstadCumpMedPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEstadoCumpMedida)) {
            return false;
        }
        TEstadoCumpMedida other = (TEstadoCumpMedida) object;
        if ((this.idEstadCumpMedPk == null && other.idEstadCumpMedPk != null) || (this.idEstadCumpMedPk != null && !this.idEstadCumpMedPk.equals(other.idEstadCumpMedPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TEstadoCumpMedida[ idEstadCumpMedPk=" + idEstadCumpMedPk + " ]";
    }
    
}
