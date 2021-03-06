/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bueno.pc01.data_access.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author darkmaku
 */
@Entity
@Table(name = "Alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByChrAluCodigo", query = "SELECT a FROM Alumno a WHERE a.chrAluCodigo = :chrAluCodigo"),
    @NamedQuery(name = "Alumno.findByVchAluNombres", query = "SELECT a FROM Alumno a WHERE a.vchAluNombres = :vchAluNombres"),
    @NamedQuery(name = "Alumno.findByVchAluApellidos", query = "SELECT a FROM Alumno a WHERE a.vchAluApellidos = :vchAluApellidos"),
    @NamedQuery(name = "Alumno.findByDtmAluFechaNac", query = "SELECT a FROM Alumno a WHERE a.dtmAluFechaNac = :dtmAluFechaNac"),
    @NamedQuery(name = "Alumno.findByChrAluSexo", query = "SELECT a FROM Alumno a WHERE a.chrAluSexo = :chrAluSexo")})
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "chrAluCodigo")
    private String chrAluCodigo;
    @Size(max = 50)
    @Column(name = "vchAluNombres")
    private String vchAluNombres;
    @Size(max = 50)
    @Column(name = "vchAluApellidos")
    private String vchAluApellidos;
    @Column(name = "dtmAluFechaNac")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmAluFechaNac;
    @Column(name = "chrAluSexo")
    private Character chrAluSexo;

    public Alumno() {
    }

    public Alumno(String chrAluCodigo) {
        this.chrAluCodigo = chrAluCodigo;
    }

    public String getChrAluCodigo() {
        return chrAluCodigo;
    }

    public void setChrAluCodigo(String chrAluCodigo) {
        this.chrAluCodigo = chrAluCodigo;
    }

    public String getVchAluNombres() {
        return vchAluNombres;
    }

    public void setVchAluNombres(String vchAluNombres) {
        this.vchAluNombres = vchAluNombres;
    }

    public String getVchAluApellidos() {
        return vchAluApellidos;
    }

    public void setVchAluApellidos(String vchAluApellidos) {
        this.vchAluApellidos = vchAluApellidos;
    }

    public Date getDtmAluFechaNac() {
        return dtmAluFechaNac;
    }

    public void setDtmAluFechaNac(Date dtmAluFechaNac) {
        this.dtmAluFechaNac = dtmAluFechaNac;
    }

    public Character getChrAluSexo() {
        return chrAluSexo;
    }

    public void setChrAluSexo(Character chrAluSexo) {
        this.chrAluSexo = chrAluSexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chrAluCodigo != null ? chrAluCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.chrAluCodigo == null && other.chrAluCodigo != null) || (this.chrAluCodigo != null && !this.chrAluCodigo.equals(other.chrAluCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bueno.pc01.dataAccess.entities.Alumno[ chrAluCodigo=" + chrAluCodigo + " ]";
    }
    
}
