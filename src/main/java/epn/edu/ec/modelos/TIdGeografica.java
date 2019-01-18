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
@Table(name = "t_id_geografica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TIdGeografica.findAll", query = "SELECT t FROM TIdGeografica t")
    , @NamedQuery(name = "TIdGeografica.findByIdIdGeograficaPk", query = "SELECT t FROM TIdGeografica t WHERE t.idIdGeograficaPk = :idIdGeograficaPk")
    , @NamedQuery(name = "TIdGeografica.findByPaisNacimiento", query = "SELECT t FROM TIdGeografica t WHERE t.paisNacimiento = :paisNacimiento")
    , @NamedQuery(name = "TIdGeografica.findByProvinciaAdolescent", query = "SELECT t FROM TIdGeografica t WHERE t.provinciaAdolescent = :provinciaAdolescent")
    , @NamedQuery(name = "TIdGeografica.findByCantonAdolescente", query = "SELECT t FROM TIdGeografica t WHERE t.cantonAdolescente = :cantonAdolescente")
    , @NamedQuery(name = "TIdGeografica.findByParroquia", query = "SELECT t FROM TIdGeografica t WHERE t.parroquia = :parroquia")
    , @NamedQuery(name = "TIdGeografica.findByDireccionDomicilio", query = "SELECT t FROM TIdGeografica t WHERE t.direccionDomicilio = :direccionDomicilio")
    , @NamedQuery(name = "TIdGeografica.findByReferenciaDomicilio", query = "SELECT t FROM TIdGeografica t WHERE t.referenciaDomicilio = :referenciaDomicilio")
    , @NamedQuery(name = "TIdGeografica.findByTelefono", query = "SELECT t FROM TIdGeografica t WHERE t.telefono = :telefono")})
public class TIdGeografica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_id_geografica_pk")
    private Integer idIdGeograficaPk;
    @Size(max = 20)
    @Column(name = "pais_nacimiento")
    private String paisNacimiento;
    @Size(max = 20)
    @Column(name = "provincia_adolescent")
    private String provinciaAdolescent;
    @Size(max = 20)
    @Column(name = "canton_adolescente")
    private String cantonAdolescente;
    @Size(max = 20)
    @Column(name = "parroquia")
    private String parroquia;
    @Size(max = 125)
    @Column(name = "direccion_domicilio")
    private String direccionDomicilio;
    @Size(max = 125)
    @Column(name = "referencia_domicilio")
    private String referenciaDomicilio;
    @Size(max = 10)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TIdGeografica() {
    }

    public TIdGeografica(Integer idIdGeograficaPk) {
        this.idIdGeograficaPk = idIdGeograficaPk;
    }

    public Integer getIdIdGeograficaPk() {
        return idIdGeograficaPk;
    }

    public void setIdIdGeograficaPk(Integer idIdGeograficaPk) {
        this.idIdGeograficaPk = idIdGeograficaPk;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getProvinciaAdolescent() {
        return provinciaAdolescent;
    }

    public void setProvinciaAdolescent(String provinciaAdolescent) {
        this.provinciaAdolescent = provinciaAdolescent;
    }

    public String getCantonAdolescente() {
        return cantonAdolescente;
    }

    public void setCantonAdolescente(String cantonAdolescente) {
        this.cantonAdolescente = cantonAdolescente;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getReferenciaDomicilio() {
        return referenciaDomicilio;
    }

    public void setReferenciaDomicilio(String referenciaDomicilio) {
        this.referenciaDomicilio = referenciaDomicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (idIdGeograficaPk != null ? idIdGeograficaPk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TIdGeografica)) {
            return false;
        }
        TIdGeografica other = (TIdGeografica) object;
        if ((this.idIdGeograficaPk == null && other.idIdGeograficaPk != null) || (this.idIdGeograficaPk != null && !this.idIdGeograficaPk.equals(other.idIdGeograficaPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TIdGeografica[ idIdGeograficaPk=" + idIdGeograficaPk + " ]";
    }
    
}
