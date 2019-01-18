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
@Table(name = "t_eje_educativo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TEjeEducativo.findAll", query = "SELECT t FROM TEjeEducativo t")
    , @NamedQuery(name = "TEjeEducativo.findByIdEjeEducativoPk", query = "SELECT t FROM TEjeEducativo t WHERE t.idEjeEducativoPk = :idEjeEducativoPk")
    , @NamedQuery(name = "TEjeEducativo.findByCodigoUnicoElectri", query = "SELECT t FROM TEjeEducativo t WHERE t.codigoUnicoElectri = :codigoUnicoElectri")
    , @NamedQuery(name = "TEjeEducativo.findByCoorZonEduDomEst", query = "SELECT t FROM TEjeEducativo t WHERE t.coorZonEduDomEst = :coorZonEduDomEst")
    , @NamedQuery(name = "TEjeEducativo.findByDistEduDomEst", query = "SELECT t FROM TEjeEducativo t WHERE t.distEduDomEst = :distEduDomEst")
    , @NamedQuery(name = "TEjeEducativo.findByEstudia", query = "SELECT t FROM TEjeEducativo t WHERE t.estudia = :estudia")
    , @NamedQuery(name = "TEjeEducativo.findByRazonNoEstudia", query = "SELECT t FROM TEjeEducativo t WHERE t.razonNoEstudia = :razonNoEstudia")
    , @NamedQuery(name = "TEjeEducativo.findByUltNivEduAprobado", query = "SELECT t FROM TEjeEducativo t WHERE t.ultNivEduAprobado = :ultNivEduAprobado")
    , @NamedQuery(name = "TEjeEducativo.findByNombreUnidEduUlti", query = "SELECT t FROM TEjeEducativo t WHERE t.nombreUnidEduUlti = :nombreUnidEduUlti")
    , @NamedQuery(name = "TEjeEducativo.findBySostenimientoUltNiv", query = "SELECT t FROM TEjeEducativo t WHERE t.sostenimientoUltNiv = :sostenimientoUltNiv")
    , @NamedQuery(name = "TEjeEducativo.findByAniosRezagoEscolar", query = "SELECT t FROM TEjeEducativo t WHERE t.aniosRezagoEscolar = :aniosRezagoEscolar")
    , @NamedQuery(name = "TEjeEducativo.findByNivelEduActual", query = "SELECT t FROM TEjeEducativo t WHERE t.nivelEduActual = :nivelEduActual")
    , @NamedQuery(name = "TEjeEducativo.findByTipoOferta", query = "SELECT t FROM TEjeEducativo t WHERE t.tipoOferta = :tipoOferta")
    , @NamedQuery(name = "TEjeEducativo.findByNombreUniEdu", query = "SELECT t FROM TEjeEducativo t WHERE t.nombreUniEdu = :nombreUniEdu")
    , @NamedQuery(name = "TEjeEducativo.findBySostenimiento", query = "SELECT t FROM TEjeEducativo t WHERE t.sostenimiento = :sostenimiento")
    , @NamedQuery(name = "TEjeEducativo.findByRegimenEducativo", query = "SELECT t FROM TEjeEducativo t WHERE t.regimenEducativo = :regimenEducativo")})
public class TEjeEducativo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_eje_educativo_pk")
    private Integer idEjeEducativoPk;
    @Size(max = 10)
    @Column(name = "codigo_unico_electri")
    private String codigoUnicoElectri;
    @Size(max = 7)
    @Column(name = "coor_zon_edu_dom_est")
    private String coorZonEduDomEst;
    @Size(max = 20)
    @Column(name = "dist_edu_dom_est")
    private String distEduDomEst;
    @Column(name = "estudia")
    private Boolean estudia;
    @Size(max = 100)
    @Column(name = "razon_no_estudia")
    private String razonNoEstudia;
    @Size(max = 40)
    @Column(name = "ult_niv_edu_aprobado")
    private String ultNivEduAprobado;
    @Size(max = 50)
    @Column(name = "nombre_unid_edu_ulti")
    private String nombreUnidEduUlti;
    @Size(max = 20)
    @Column(name = "sostenimiento_ult_niv")
    private String sostenimientoUltNiv;
    @Column(name = "anios_rezago_escolar")
    private Integer aniosRezagoEscolar;
    @Size(max = 40)
    @Column(name = "nivel_edu_actual")
    private String nivelEduActual;
    @Size(max = 15)
    @Column(name = "tipo_oferta")
    private String tipoOferta;
    @Size(max = 50)
    @Column(name = "nombre_uni_edu")
    private String nombreUniEdu;
    @Size(max = 20)
    @Column(name = "sostenimiento")
    private String sostenimiento;
    @Size(max = 10)
    @Column(name = "regimen_educativo")
    private String regimenEducativo;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TEjeEducativo() {
    }

    public TEjeEducativo(Integer idEjeEducativoPk) {
        this.idEjeEducativoPk = idEjeEducativoPk;
    }

    public Integer getIdEjeEducativoPk() {
        return idEjeEducativoPk;
    }

    public void setIdEjeEducativoPk(Integer idEjeEducativoPk) {
        this.idEjeEducativoPk = idEjeEducativoPk;
    }

    public String getCodigoUnicoElectri() {
        return codigoUnicoElectri;
    }

    public void setCodigoUnicoElectri(String codigoUnicoElectri) {
        this.codigoUnicoElectri = codigoUnicoElectri;
    }

    public String getCoorZonEduDomEst() {
        return coorZonEduDomEst;
    }

    public void setCoorZonEduDomEst(String coorZonEduDomEst) {
        this.coorZonEduDomEst = coorZonEduDomEst;
    }

    public String getDistEduDomEst() {
        return distEduDomEst;
    }

    public void setDistEduDomEst(String distEduDomEst) {
        this.distEduDomEst = distEduDomEst;
    }

    public Boolean getEstudia() {
        return estudia;
    }

    public void setEstudia(Boolean estudia) {
        this.estudia = estudia;
    }

    public String getRazonNoEstudia() {
        return razonNoEstudia;
    }

    public void setRazonNoEstudia(String razonNoEstudia) {
        this.razonNoEstudia = razonNoEstudia;
    }

    public String getUltNivEduAprobado() {
        return ultNivEduAprobado;
    }

    public void setUltNivEduAprobado(String ultNivEduAprobado) {
        this.ultNivEduAprobado = ultNivEduAprobado;
    }

    public String getNombreUnidEduUlti() {
        return nombreUnidEduUlti;
    }

    public void setNombreUnidEduUlti(String nombreUnidEduUlti) {
        this.nombreUnidEduUlti = nombreUnidEduUlti;
    }

    public String getSostenimientoUltNiv() {
        return sostenimientoUltNiv;
    }

    public void setSostenimientoUltNiv(String sostenimientoUltNiv) {
        this.sostenimientoUltNiv = sostenimientoUltNiv;
    }

    public Integer getAniosRezagoEscolar() {
        return aniosRezagoEscolar;
    }

    public void setAniosRezagoEscolar(Integer aniosRezagoEscolar) {
        this.aniosRezagoEscolar = aniosRezagoEscolar;
    }

    public String getNivelEduActual() {
        return nivelEduActual;
    }

    public void setNivelEduActual(String nivelEduActual) {
        this.nivelEduActual = nivelEduActual;
    }

    public String getTipoOferta() {
        return tipoOferta;
    }

    public void setTipoOferta(String tipoOferta) {
        this.tipoOferta = tipoOferta;
    }

    public String getNombreUniEdu() {
        return nombreUniEdu;
    }

    public void setNombreUniEdu(String nombreUniEdu) {
        this.nombreUniEdu = nombreUniEdu;
    }

    public String getSostenimiento() {
        return sostenimiento;
    }

    public void setSostenimiento(String sostenimiento) {
        this.sostenimiento = sostenimiento;
    }

    public String getRegimenEducativo() {
        return regimenEducativo;
    }

    public void setRegimenEducativo(String regimenEducativo) {
        this.regimenEducativo = regimenEducativo;
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
        hash += (idEjeEducativoPk != null ? idEjeEducativoPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TEjeEducativo)) {
            return false;
        }
        TEjeEducativo other = (TEjeEducativo) object;
        if ((this.idEjeEducativoPk == null && other.idEjeEducativoPk != null) || (this.idEjeEducativoPk != null && !this.idEjeEducativoPk.equals(other.idEjeEducativoPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TEjeEducativo[ idEjeEducativoPk=" + idEjeEducativoPk + " ]";
    }
    
}
