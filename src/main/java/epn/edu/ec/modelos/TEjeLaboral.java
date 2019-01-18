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
@Table(name = "t_eje_laboral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEjeLaboral.findAll", query = "SELECT t FROM TEjeLaboral t")
    , @NamedQuery(name = "TEjeLaboral.findByIdEjeLaboralPk", query = "SELECT t FROM TEjeLaboral t WHERE t.idEjeLaboralPk = :idEjeLaboralPk")
    , @NamedQuery(name = "TEjeLaboral.findByTrabaja", query = "SELECT t FROM TEjeLaboral t WHERE t.trabaja = :trabaja")
    , @NamedQuery(name = "TEjeLaboral.findByOcupacionAdolescent", query = "SELECT t FROM TEjeLaboral t WHERE t.ocupacionAdolescent = :ocupacionAdolescent")
    , @NamedQuery(name = "TEjeLaboral.findByRamaActivEcon", query = "SELECT t FROM TEjeLaboral t WHERE t.ramaActivEcon = :ramaActivEcon")
    , @NamedQuery(name = "TEjeLaboral.findByDescripcionActiv", query = "SELECT t FROM TEjeLaboral t WHERE t.descripcionActiv = :descripcionActiv")
    , @NamedQuery(name = "TEjeLaboral.findByNumHorasTrabajo", query = "SELECT t FROM TEjeLaboral t WHERE t.numHorasTrabajo = :numHorasTrabajo")
    , @NamedQuery(name = "TEjeLaboral.findByIngresoMensual", query = "SELECT t FROM TEjeLaboral t WHERE t.ingresoMensual = :ingresoMensual")
    , @NamedQuery(name = "TEjeLaboral.findByAfiliacionIess", query = "SELECT t FROM TEjeLaboral t WHERE t.afiliacionIess = :afiliacionIess")
    , @NamedQuery(name = "TEjeLaboral.findByInclinacionVocacion", query = "SELECT t FROM TEjeLaboral t WHERE t.inclinacionVocacion = :inclinacionVocacion")})
public class TEjeLaboral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje_laboral_pk")
    private Integer idEjeLaboralPk;
    @Column(name = "trabaja")
    private Boolean trabaja;
    @Size(max = 30)
    @Column(name = "ocupacion_adolescent")
    private String ocupacionAdolescent;
    @Size(max = 20)
    @Column(name = "rama_activ_econ")
    private String ramaActivEcon;
    @Size(max = 100)
    @Column(name = "descripcion_activ")
    private String descripcionActiv;
    @Column(name = "num_horas_trabajo")
    private Integer numHorasTrabajo;
    @Size(max = 20)
    @Column(name = "ingreso_mensual")
    private String ingresoMensual;
    @Column(name = "afiliacion_iess")
    private Boolean afiliacionIess;
    @Size(max = 80)
    @Column(name = "inclinacion_vocacion")
    private String inclinacionVocacion;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TEjeLaboral() {
    }

    public TEjeLaboral(Integer idEjeLaboralPk) {
        this.idEjeLaboralPk = idEjeLaboralPk;
    }

    public Integer getIdEjeLaboralPk() {
        return idEjeLaboralPk;
    }

    public void setIdEjeLaboralPk(Integer idEjeLaboralPk) {
        this.idEjeLaboralPk = idEjeLaboralPk;
    }

    public Boolean getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(Boolean trabaja) {
        this.trabaja = trabaja;
    }

    public String getOcupacionAdolescent() {
        return ocupacionAdolescent;
    }

    public void setOcupacionAdolescent(String ocupacionAdolescent) {
        this.ocupacionAdolescent = ocupacionAdolescent;
    }

    public String getRamaActivEcon() {
        return ramaActivEcon;
    }

    public void setRamaActivEcon(String ramaActivEcon) {
        this.ramaActivEcon = ramaActivEcon;
    }

    public String getDescripcionActiv() {
        return descripcionActiv;
    }

    public void setDescripcionActiv(String descripcionActiv) {
        this.descripcionActiv = descripcionActiv;
    }

    public Integer getNumHorasTrabajo() {
        return numHorasTrabajo;
    }

    public void setNumHorasTrabajo(Integer numHorasTrabajo) {
        this.numHorasTrabajo = numHorasTrabajo;
    }

    public String getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(String ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public Boolean getAfiliacionIess() {
        return afiliacionIess;
    }

    public void setAfiliacionIess(Boolean afiliacionIess) {
        this.afiliacionIess = afiliacionIess;
    }

    public String getInclinacionVocacion() {
        return inclinacionVocacion;
    }

    public void setInclinacionVocacion(String inclinacionVocacion) {
        this.inclinacionVocacion = inclinacionVocacion;
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
        hash += (idEjeLaboralPk != null ? idEjeLaboralPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEjeLaboral)) {
            return false;
        }
        TEjeLaboral other = (TEjeLaboral) object;
        if ((this.idEjeLaboralPk == null && other.idEjeLaboralPk != null) || (this.idEjeLaboralPk != null && !this.idEjeLaboralPk.equals(other.idEjeLaboralPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TEjeLaboral[ idEjeLaboralPk=" + idEjeLaboralPk + " ]";
    }
    
}
