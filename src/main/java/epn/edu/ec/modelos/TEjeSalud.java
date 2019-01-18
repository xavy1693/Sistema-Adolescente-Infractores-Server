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
@Table(name = "t_eje_salud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEjeSalud.findAll", query = "SELECT t FROM TEjeSalud t")
    , @NamedQuery(name = "TEjeSalud.findByIdEjeSaludPk", query = "SELECT t FROM TEjeSalud t WHERE t.idEjeSaludPk = :idEjeSaludPk")
    , @NamedQuery(name = "TEjeSalud.findBySituacionSalud", query = "SELECT t FROM TEjeSalud t WHERE t.situacionSalud = :situacionSalud")
    , @NamedQuery(name = "TEjeSalud.findByDiagnosticoEnfermed", query = "SELECT t FROM TEjeSalud t WHERE t.diagnosticoEnfermed = :diagnosticoEnfermed")
    , @NamedQuery(name = "TEjeSalud.findByRecibeTratamiento", query = "SELECT t FROM TEjeSalud t WHERE t.recibeTratamiento = :recibeTratamiento")
    , @NamedQuery(name = "TEjeSalud.findByTomaMedicacion", query = "SELECT t FROM TEjeSalud t WHERE t.tomaMedicacion = :tomaMedicacion")
    , @NamedQuery(name = "TEjeSalud.findByNumHistoriaClinica", query = "SELECT t FROM TEjeSalud t WHERE t.numHistoriaClinica = :numHistoriaClinica")
    , @NamedQuery(name = "TEjeSalud.findByEmbarazo", query = "SELECT t FROM TEjeSalud t WHERE t.embarazo = :embarazo")
    , @NamedQuery(name = "TEjeSalud.findByTiempGestacionMes", query = "SELECT t FROM TEjeSalud t WHERE t.tiempGestacionMes = :tiempGestacionMes")
    , @NamedQuery(name = "TEjeSalud.findByConsumeSustancias", query = "SELECT t FROM TEjeSalud t WHERE t.consumeSustancias = :consumeSustancias")
    , @NamedQuery(name = "TEjeSalud.findByTipoSustancia", query = "SELECT t FROM TEjeSalud t WHERE t.tipoSustancia = :tipoSustancia")
    , @NamedQuery(name = "TEjeSalud.findByRecibeTratamDrogas", query = "SELECT t FROM TEjeSalud t WHERE t.recibeTratamDrogas = :recibeTratamDrogas")})
public class TEjeSalud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje_salud_pk")
    private Integer idEjeSaludPk;
    @Size(max = 15)
    @Column(name = "situacion_salud")
    private String situacionSalud;
    @Size(max = 100)
    @Column(name = "diagnostico_enfermed")
    private String diagnosticoEnfermed;
    @Column(name = "recibe_tratamiento")
    private Boolean recibeTratamiento;
    @Column(name = "toma_medicacion")
    private Boolean tomaMedicacion;
    @Size(max = 10)
    @Column(name = "num_historia_clinica")
    private String numHistoriaClinica;
    @Size(max = 10)
    @Column(name = "embarazo")
    private String embarazo;
    @Size(max = 10)
    @Column(name = "tiemp_gestacion_mes")
    private String tiempGestacionMes;
    @Column(name = "consume_sustancias")
    private Boolean consumeSustancias;
    @Size(max = 20)
    @Column(name = "tipo_sustancia")
    private String tipoSustancia;
    @Column(name = "recibe_tratam_drogas")
    private Boolean recibeTratamDrogas;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TEjeSalud() {
    }

    public TEjeSalud(Integer idEjeSaludPk) {
        this.idEjeSaludPk = idEjeSaludPk;
    }

    public Integer getIdEjeSaludPk() {
        return idEjeSaludPk;
    }

    public void setIdEjeSaludPk(Integer idEjeSaludPk) {
        this.idEjeSaludPk = idEjeSaludPk;
    }

    public String getSituacionSalud() {
        return situacionSalud;
    }

    public void setSituacionSalud(String situacionSalud) {
        this.situacionSalud = situacionSalud;
    }

    public String getDiagnosticoEnfermed() {
        return diagnosticoEnfermed;
    }

    public void setDiagnosticoEnfermed(String diagnosticoEnfermed) {
        this.diagnosticoEnfermed = diagnosticoEnfermed;
    }

    public Boolean getRecibeTratamiento() {
        return recibeTratamiento;
    }

    public void setRecibeTratamiento(Boolean recibeTratamiento) {
        this.recibeTratamiento = recibeTratamiento;
    }

    public Boolean getTomaMedicacion() {
        return tomaMedicacion;
    }

    public void setTomaMedicacion(Boolean tomaMedicacion) {
        this.tomaMedicacion = tomaMedicacion;
    }

    public String getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(String numHistoriaClinica) {
        this.numHistoriaClinica = numHistoriaClinica;
    }

    public String getEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(String embarazo) {
        this.embarazo = embarazo;
    }

    public String getTiempGestacionMes() {
        return tiempGestacionMes;
    }

    public void setTiempGestacionMes(String tiempGestacionMes) {
        this.tiempGestacionMes = tiempGestacionMes;
    }

    public Boolean getConsumeSustancias() {
        return consumeSustancias;
    }

    public void setConsumeSustancias(Boolean consumeSustancias) {
        this.consumeSustancias = consumeSustancias;
    }

    public String getTipoSustancia() {
        return tipoSustancia;
    }

    public void setTipoSustancia(String tipoSustancia) {
        this.tipoSustancia = tipoSustancia;
    }

    public Boolean getRecibeTratamDrogas() {
        return recibeTratamDrogas;
    }

    public void setRecibeTratamDrogas(Boolean recibeTratamDrogas) {
        this.recibeTratamDrogas = recibeTratamDrogas;
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
        hash += (idEjeSaludPk != null ? idEjeSaludPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEjeSalud)) {
            return false;
        }
        TEjeSalud other = (TEjeSalud) object;
        if ((this.idEjeSaludPk == null && other.idEjeSaludPk != null) || (this.idEjeSaludPk != null && !this.idEjeSaludPk.equals(other.idEjeSaludPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TEjeSalud[ idEjeSaludPk=" + idEjeSaludPk + " ]";
    }
    
}
