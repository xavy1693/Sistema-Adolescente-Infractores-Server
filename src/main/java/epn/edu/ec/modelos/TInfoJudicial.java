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
@Table(name = "t_info_judicial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TInfoJudicial.findAll", query = "SELECT t FROM TInfoJudicial t")
    , @NamedQuery(name = "TInfoJudicial.findByIdInfoJudicialPk", query = "SELECT t FROM TInfoJudicial t WHERE t.idInfoJudicialPk = :idInfoJudicialPk")
    , @NamedQuery(name = "TInfoJudicial.findByReincidencia", query = "SELECT t FROM TInfoJudicial t WHERE t.reincidencia = :reincidencia")
    , @NamedQuery(name = "TInfoJudicial.findByNombreFiscal", query = "SELECT t FROM TInfoJudicial t WHERE t.nombreFiscal = :nombreFiscal")
    , @NamedQuery(name = "TInfoJudicial.findByUnidadJudicial", query = "SELECT t FROM TInfoJudicial t WHERE t.unidadJudicial = :unidadJudicial")
    , @NamedQuery(name = "TInfoJudicial.findByNombreJuez", query = "SELECT t FROM TInfoJudicial t WHERE t.nombreJuez = :nombreJuez")
    , @NamedQuery(name = "TInfoJudicial.findByDefensor", query = "SELECT t FROM TInfoJudicial t WHERE t.defensor = :defensor")
    , @NamedQuery(name = "TInfoJudicial.findByNombreDefensor", query = "SELECT t FROM TInfoJudicial t WHERE t.nombreDefensor = :nombreDefensor")
    , @NamedQuery(name = "TInfoJudicial.findByNumeroCausa", query = "SELECT t FROM TInfoJudicial t WHERE t.numeroCausa = :numeroCausa")
    , @NamedQuery(name = "TInfoJudicial.findByFechaImposMed", query = "SELECT t FROM TInfoJudicial t WHERE t.fechaImposMed = :fechaImposMed")
    , @NamedQuery(name = "TInfoJudicial.findByFechaRepecZonReso", query = "SELECT t FROM TInfoJudicial t WHERE t.fechaRepecZonReso = :fechaRepecZonReso")
    , @NamedQuery(name = "TInfoJudicial.findByFechaIniCumpMed", query = "SELECT t FROM TInfoJudicial t WHERE t.fechaIniCumpMed = :fechaIniCumpMed")
    , @NamedQuery(name = "TInfoJudicial.findByFormaImposMed", query = "SELECT t FROM TInfoJudicial t WHERE t.formaImposMed = :formaImposMed")
    , @NamedQuery(name = "TInfoJudicial.findByTipoTermAntiMed", query = "SELECT t FROM TInfoJudicial t WHERE t.tipoTermAntiMed = :tipoTermAntiMed")
    , @NamedQuery(name = "TInfoJudicial.findByAmonestacionVerbal", query = "SELECT t FROM TInfoJudicial t WHERE t.amonestacionVerbal = :amonestacionVerbal")
    , @NamedQuery(name = "TInfoJudicial.findByImposReglasCond", query = "SELECT t FROM TInfoJudicial t WHERE t.imposReglasCond = :imposReglasCond")
    , @NamedQuery(name = "TInfoJudicial.findByOrientApoSocFami", query = "SELECT t FROM TInfoJudicial t WHERE t.orientApoSocFami = :orientApoSocFami")
    , @NamedQuery(name = "TInfoJudicial.findByServicioComunidad", query = "SELECT t FROM TInfoJudicial t WHERE t.servicioComunidad = :servicioComunidad")
    , @NamedQuery(name = "TInfoJudicial.findByLibertadAsistida", query = "SELECT t FROM TInfoJudicial t WHERE t.libertadAsistida = :libertadAsistida")
    , @NamedQuery(name = "TInfoJudicial.findByNumeroMedidas", query = "SELECT t FROM TInfoJudicial t WHERE t.numeroMedidas = :numeroMedidas")})
public class TInfoJudicial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_info_judicial_pk")
    private Integer idInfoJudicialPk;
    @Column(name = "reincidencia")
    private Boolean reincidencia;
    @Size(max = 40)
    @Column(name = "nombre_fiscal")
    private String nombreFiscal;
    @Size(max = 20)
    @Column(name = "unidad_judicial")
    private String unidadJudicial;
    @Size(max = 40)
    @Column(name = "nombre_juez")
    private String nombreJuez;
    @Size(max = 10)
    @Column(name = "defensor")
    private String defensor;
    @Size(max = 40)
    @Column(name = "nombre_defensor")
    private String nombreDefensor;
    @Size(max = 10)
    @Column(name = "numero_causa")
    private String numeroCausa;
    @Column(name = "fecha_impos_med")
    @Temporal(TemporalType.DATE)
    private Date fechaImposMed;
    @Column(name = "fecha_repec_zon_reso")
    @Temporal(TemporalType.DATE)
    private Date fechaRepecZonReso;
    @Column(name = "fecha_ini_cump_med")
    @Temporal(TemporalType.DATE)
    private Date fechaIniCumpMed;
    @Size(max = 40)
    @Column(name = "forma_impos_med")
    private String formaImposMed;
    @Size(max = 40)
    @Column(name = "tipo_term_anti_med")
    private String tipoTermAntiMed;
    @Column(name = "amonestacion_verbal")
    private Boolean amonestacionVerbal;
    @Column(name = "impos_reglas_cond")
    private Boolean imposReglasCond;
    @Column(name = "orient_apo_soc_fami")
    private Boolean orientApoSocFami;
    @Column(name = "servicio_comunidad")
    private Boolean servicioComunidad;
    @Column(name = "libertad_asistida")
    private Boolean libertadAsistida;
    @Column(name = "numero_medidas")
    private Integer numeroMedidas;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TInfoJudicial() {
    }

    public TInfoJudicial(Integer idInfoJudicialPk) {
        this.idInfoJudicialPk = idInfoJudicialPk;
    }

    public Integer getIdInfoJudicialPk() {
        return idInfoJudicialPk;
    }

    public void setIdInfoJudicialPk(Integer idInfoJudicialPk) {
        this.idInfoJudicialPk = idInfoJudicialPk;
    }

    public Boolean getReincidencia() {
        return reincidencia;
    }

    public void setReincidencia(Boolean reincidencia) {
        this.reincidencia = reincidencia;
    }

    public String getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(String nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public String getUnidadJudicial() {
        return unidadJudicial;
    }

    public void setUnidadJudicial(String unidadJudicial) {
        this.unidadJudicial = unidadJudicial;
    }

    public String getNombreJuez() {
        return nombreJuez;
    }

    public void setNombreJuez(String nombreJuez) {
        this.nombreJuez = nombreJuez;
    }

    public String getDefensor() {
        return defensor;
    }

    public void setDefensor(String defensor) {
        this.defensor = defensor;
    }

    public String getNombreDefensor() {
        return nombreDefensor;
    }

    public void setNombreDefensor(String nombreDefensor) {
        this.nombreDefensor = nombreDefensor;
    }

    public String getNumeroCausa() {
        return numeroCausa;
    }

    public void setNumeroCausa(String numeroCausa) {
        this.numeroCausa = numeroCausa;
    }

    public Date getFechaImposMed() {
        return fechaImposMed;
    }

    public void setFechaImposMed(Date fechaImposMed) {
        this.fechaImposMed = fechaImposMed;
    }

    public Date getFechaRepecZonReso() {
        return fechaRepecZonReso;
    }

    public void setFechaRepecZonReso(Date fechaRepecZonReso) {
        this.fechaRepecZonReso = fechaRepecZonReso;
    }

    public Date getFechaIniCumpMed() {
        return fechaIniCumpMed;
    }

    public void setFechaIniCumpMed(Date fechaIniCumpMed) {
        this.fechaIniCumpMed = fechaIniCumpMed;
    }

    public String getFormaImposMed() {
        return formaImposMed;
    }

    public void setFormaImposMed(String formaImposMed) {
        this.formaImposMed = formaImposMed;
    }

    public String getTipoTermAntiMed() {
        return tipoTermAntiMed;
    }

    public void setTipoTermAntiMed(String tipoTermAntiMed) {
        this.tipoTermAntiMed = tipoTermAntiMed;
    }

    public Boolean getAmonestacionVerbal() {
        return amonestacionVerbal;
    }

    public void setAmonestacionVerbal(Boolean amonestacionVerbal) {
        this.amonestacionVerbal = amonestacionVerbal;
    }

    public Boolean getImposReglasCond() {
        return imposReglasCond;
    }

    public void setImposReglasCond(Boolean imposReglasCond) {
        this.imposReglasCond = imposReglasCond;
    }

    public Boolean getOrientApoSocFami() {
        return orientApoSocFami;
    }

    public void setOrientApoSocFami(Boolean orientApoSocFami) {
        this.orientApoSocFami = orientApoSocFami;
    }

    public Boolean getServicioComunidad() {
        return servicioComunidad;
    }

    public void setServicioComunidad(Boolean servicioComunidad) {
        this.servicioComunidad = servicioComunidad;
    }

    public Boolean getLibertadAsistida() {
        return libertadAsistida;
    }

    public void setLibertadAsistida(Boolean libertadAsistida) {
        this.libertadAsistida = libertadAsistida;
    }

    public Integer getNumeroMedidas() {
        return numeroMedidas;
    }

    public void setNumeroMedidas(Integer numeroMedidas) {
        this.numeroMedidas = numeroMedidas;
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
        hash += (idInfoJudicialPk != null ? idInfoJudicialPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TInfoJudicial)) {
            return false;
        }
        TInfoJudicial other = (TInfoJudicial) object;
        if ((this.idInfoJudicialPk == null && other.idInfoJudicialPk != null) || (this.idInfoJudicialPk != null && !this.idInfoJudicialPk.equals(other.idInfoJudicialPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TInfoJudicial[ idInfoJudicialPk=" + idInfoJudicialPk + " ]";
    }
    
}
