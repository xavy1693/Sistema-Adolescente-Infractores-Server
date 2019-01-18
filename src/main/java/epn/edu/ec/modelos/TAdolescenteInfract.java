/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "t_adolescente_infract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAdolescenteInfract.findAll", query = "SELECT t FROM TAdolescenteInfract t")
    , @NamedQuery(name = "TAdolescenteInfract.findByIdAdolescentePk", query = "SELECT t FROM TAdolescenteInfract t WHERE t.idAdolescentePk = :idAdolescentePk")
    , @NamedQuery(name = "TAdolescenteInfract.findByNombres", query = "SELECT t FROM TAdolescenteInfract t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "TAdolescenteInfract.findByApellidos", query = "SELECT t FROM TAdolescenteInfract t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "TAdolescenteInfract.findByCedula", query = "SELECT t FROM TAdolescenteInfract t WHERE t.cedula = :cedula")
    , @NamedQuery(name = "TAdolescenteInfract.findByGenero", query = "SELECT t FROM TAdolescenteInfract t WHERE t.genero = :genero")
    , @NamedQuery(name = "TAdolescenteInfract.findByEtnia", query = "SELECT t FROM TAdolescenteInfract t WHERE t.etnia = :etnia")
    , @NamedQuery(name = "TAdolescenteInfract.findByDiscapacidad", query = "SELECT t FROM TAdolescenteInfract t WHERE t.discapacidad = :discapacidad")
    , @NamedQuery(name = "TAdolescenteInfract.findByTipoDiscapacidad", query = "SELECT t FROM TAdolescenteInfract t WHERE t.tipoDiscapacidad = :tipoDiscapacidad")
    , @NamedQuery(name = "TAdolescenteInfract.findByPorcentajeDiscapaci", query = "SELECT t FROM TAdolescenteInfract t WHERE t.porcentajeDiscapaci = :porcentajeDiscapaci")
    , @NamedQuery(name = "TAdolescenteInfract.findByRegistroSocial", query = "SELECT t FROM TAdolescenteInfract t WHERE t.registroSocial = :registroSocial")
    , @NamedQuery(name = "TAdolescenteInfract.findByEstadoCivil", query = "SELECT t FROM TAdolescenteInfract t WHERE t.estadoCivil = :estadoCivil")
    , @NamedQuery(name = "TAdolescenteInfract.findByFechaNacimiento", query = "SELECT t FROM TAdolescenteInfract t WHERE t.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "TAdolescenteInfract.findByEdad", query = "SELECT t FROM TAdolescenteInfract t WHERE t.edad = :edad")
    , @NamedQuery(name = "TAdolescenteInfract.findByNumeroHijos", query = "SELECT t FROM TAdolescenteInfract t WHERE t.numeroHijos = :numeroHijos")
    , @NamedQuery(name = "TAdolescenteInfract.findByConQuienVive", query = "SELECT t FROM TAdolescenteInfract t WHERE t.conQuienVive = :conQuienVive")
    , @NamedQuery(name = "TAdolescenteInfract.findByEnfermedadesCr", query = "SELECT t FROM TAdolescenteInfract t WHERE t.enfermedadesCr = :enfermedadesCr")})
public class TAdolescenteInfract implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_adolescente_pk")
    private Integer idAdolescentePk;
    @Size(max = 20)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 30)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 15)
    @Column(name = "genero")
    private String genero;
    @Size(max = 20)
    @Column(name = "etnia")
    private String etnia;
    @Size(max = 20)
    @Column(name = "discapacidad")
    private String discapacidad;
    @Size(max = 20)
    @Column(name = "tipo_discapacidad")
    private String tipoDiscapacidad;
    @Column(name = "porcentaje_discapaci")
    private Integer porcentajeDiscapaci;
    @Column(name = "registro_social")
    private Boolean registroSocial;
    @Size(max = 10)
    @Column(name = "estado_civil")
    private String estadoCivil;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "numero_hijos")
    private Integer numeroHijos;
    @Size(max = 20)
    @Column(name = "con_quien_vive")
    private String conQuienVive;
    @Column(name = "enfermedades_cr")
    private Boolean enfermedadesCr;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TIdGeografica> tIdGeograficaList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TEstadoCumpMedida> tEstadoCumpMedidaList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TMedSocioeducativa> tMedSocioeducativaList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TEjeLaboral> tEjeLaboralList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TUnidadZonal> tUnidadZonalList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TEjeSalud> tEjeSaludList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TMedidaMasAlta> tMedidaMasAltaList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TActividadesInstru> tActividadesInstruList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TInfoInfraccion> tInfoInfraccionList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TRepresentante> tRepresentanteList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TEjeEducativo> tEjeEducativoList;
    @OneToMany(mappedBy = "idAdolescenteFk")
    private List<TInfoJudicial> tInfoJudicialList;

    public TAdolescenteInfract() {
    }

    public TAdolescenteInfract(Integer idAdolescentePk) {
        this.idAdolescentePk = idAdolescentePk;
    }

    public Integer getIdAdolescentePk() {
        return idAdolescentePk;
    }

    public void setIdAdolescentePk(Integer idAdolescentePk) {
        this.idAdolescentePk = idAdolescentePk;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getTipoDiscapacidad() {
        return tipoDiscapacidad;
    }

    public void setTipoDiscapacidad(String tipoDiscapacidad) {
        this.tipoDiscapacidad = tipoDiscapacidad;
    }

    public Integer getPorcentajeDiscapaci() {
        return porcentajeDiscapaci;
    }

    public void setPorcentajeDiscapaci(Integer porcentajeDiscapaci) {
        this.porcentajeDiscapaci = porcentajeDiscapaci;
    }

    public Boolean getRegistroSocial() {
        return registroSocial;
    }

    public void setRegistroSocial(Boolean registroSocial) {
        this.registroSocial = registroSocial;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public String getConQuienVive() {
        return conQuienVive;
    }

    public void setConQuienVive(String conQuienVive) {
        this.conQuienVive = conQuienVive;
    }

    public Boolean getEnfermedadesCr() {
        return enfermedadesCr;
    }

    public void setEnfermedadesCr(Boolean enfermedadesCr) {
        this.enfermedadesCr = enfermedadesCr;
    }

    @XmlTransient
    public List<TIdGeografica> getTIdGeograficaList() {
        return tIdGeograficaList;
    }

    public void setTIdGeograficaList(List<TIdGeografica> tIdGeograficaList) {
        this.tIdGeograficaList = tIdGeograficaList;
    }

    @XmlTransient
    public List<TEstadoCumpMedida> getTEstadoCumpMedidaList() {
        return tEstadoCumpMedidaList;
    }

    public void setTEstadoCumpMedidaList(List<TEstadoCumpMedida> tEstadoCumpMedidaList) {
        this.tEstadoCumpMedidaList = tEstadoCumpMedidaList;
    }

    @XmlTransient
    public List<TMedSocioeducativa> getTMedSocioeducativaList() {
        return tMedSocioeducativaList;
    }

    public void setTMedSocioeducativaList(List<TMedSocioeducativa> tMedSocioeducativaList) {
        this.tMedSocioeducativaList = tMedSocioeducativaList;
    }

    @XmlTransient
    public List<TEjeLaboral> getTEjeLaboralList() {
        return tEjeLaboralList;
    }

    public void setTEjeLaboralList(List<TEjeLaboral> tEjeLaboralList) {
        this.tEjeLaboralList = tEjeLaboralList;
    }

    @XmlTransient
    public List<TUnidadZonal> getTUnidadZonalList() {
        return tUnidadZonalList;
    }

    public void setTUnidadZonalList(List<TUnidadZonal> tUnidadZonalList) {
        this.tUnidadZonalList = tUnidadZonalList;
    }

    @XmlTransient
    public List<TEjeSalud> getTEjeSaludList() {
        return tEjeSaludList;
    }

    public void setTEjeSaludList(List<TEjeSalud> tEjeSaludList) {
        this.tEjeSaludList = tEjeSaludList;
    }

    @XmlTransient
    public List<TMedidaMasAlta> getTMedidaMasAltaList() {
        return tMedidaMasAltaList;
    }

    public void setTMedidaMasAltaList(List<TMedidaMasAlta> tMedidaMasAltaList) {
        this.tMedidaMasAltaList = tMedidaMasAltaList;
    }

    @XmlTransient
    public List<TActividadesInstru> getTActividadesInstruList() {
        return tActividadesInstruList;
    }

    public void setTActividadesInstruList(List<TActividadesInstru> tActividadesInstruList) {
        this.tActividadesInstruList = tActividadesInstruList;
    }

    @XmlTransient
    public List<TInfoInfraccion> getTInfoInfraccionList() {
        return tInfoInfraccionList;
    }

    public void setTInfoInfraccionList(List<TInfoInfraccion> tInfoInfraccionList) {
        this.tInfoInfraccionList = tInfoInfraccionList;
    }

    @XmlTransient
    public List<TRepresentante> getTRepresentanteList() {
        return tRepresentanteList;
    }

    public void setTRepresentanteList(List<TRepresentante> tRepresentanteList) {
        this.tRepresentanteList = tRepresentanteList;
    }

    @XmlTransient
    public List<TEjeEducativo> getTEjeEducativoList() {
        return tEjeEducativoList;
    }

    public void setTEjeEducativoList(List<TEjeEducativo> tEjeEducativoList) {
        this.tEjeEducativoList = tEjeEducativoList;
    }

    @XmlTransient
    public List<TInfoJudicial> getTInfoJudicialList() {
        return tInfoJudicialList;
    }

    public void setTInfoJudicialList(List<TInfoJudicial> tInfoJudicialList) {
        this.tInfoJudicialList = tInfoJudicialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdolescentePk != null ? idAdolescentePk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAdolescenteInfract)) {
            return false;
        }
        TAdolescenteInfract other = (TAdolescenteInfract) object;
        if ((this.idAdolescentePk == null && other.idAdolescentePk != null) || (this.idAdolescentePk != null && !this.idAdolescentePk.equals(other.idAdolescentePk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TAdolescenteInfract[ idAdolescentePk=" + idAdolescentePk + " ]";
    }
    
}
