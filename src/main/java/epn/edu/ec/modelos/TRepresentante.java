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
@Table(name = "t_representante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TRepresentante.findAll", query = "SELECT t FROM TRepresentante t")
    , @NamedQuery(name = "TRepresentante.findByTIdRepresentantePk", query = "SELECT t FROM TRepresentante t WHERE t.tIdRepresentantePk = :tIdRepresentantePk")
    , @NamedQuery(name = "TRepresentante.findByCedula", query = "SELECT t FROM TRepresentante t WHERE t.cedula = :cedula")
    , @NamedQuery(name = "TRepresentante.findByNombresApellidos", query = "SELECT t FROM TRepresentante t WHERE t.nombresApellidos = :nombresApellidos")
    , @NamedQuery(name = "TRepresentante.findByParentesco", query = "SELECT t FROM TRepresentante t WHERE t.parentesco = :parentesco")})
public class TRepresentante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "t_id_representante_pk")
    private Integer tIdRepresentantePk;
    @Size(max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 40)
    @Column(name = "nombres_apellidos")
    private String nombresApellidos;
    @Size(max = 15)
    @Column(name = "parentesco")
    private String parentesco;
    @JoinColumn(name = "id_adolescente_fk", referencedColumnName = "id_adolescente_pk")
    @ManyToOne
    private TAdolescenteInfract idAdolescenteFk;

    public TRepresentante() {
    }

    public TRepresentante(Integer tIdRepresentantePk) {
        this.tIdRepresentantePk = tIdRepresentantePk;
    }

    public Integer getTIdRepresentantePk() {
        return tIdRepresentantePk;
    }

    public void setTIdRepresentantePk(Integer tIdRepresentantePk) {
        this.tIdRepresentantePk = tIdRepresentantePk;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
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
        hash += (tIdRepresentantePk != null ? tIdRepresentantePk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TRepresentante)) {
            return false;
        }
        TRepresentante other = (TRepresentante) object;
        if ((this.tIdRepresentantePk == null && other.tIdRepresentantePk != null) || (this.tIdRepresentantePk != null && !this.tIdRepresentantePk.equals(other.tIdRepresentantePk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "epn.edu.ec.modelo.TRepresentante[ tIdRepresentantePk=" + tIdRepresentantePk + " ]";
    }
    
}
