/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visit.Entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 猫的鱼儿
 */
@Entity
@Table(name = "spotpassage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spotpassage.findAll", query = "SELECT s FROM Spotpassage s"),
    @NamedQuery(name = "Spotpassage.findByPassageId", query = "SELECT s FROM Spotpassage s WHERE s.spotpassagePK.passageId = :passageId"),
    @NamedQuery(name = "Spotpassage.findBySpotId", query = "SELECT s FROM Spotpassage s WHERE s.spotpassagePK.spotId = :spotId")})
public class Spotpassage implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpotpassagePK spotpassagePK;

    public Spotpassage() {
    }

    public Spotpassage(SpotpassagePK spotpassagePK) {
        this.spotpassagePK = spotpassagePK;
    }

    public Spotpassage(int passageId, int spotId) {
        this.spotpassagePK = new SpotpassagePK(passageId, spotId);
    }

    public SpotpassagePK getSpotpassagePK() {
        return spotpassagePK;
    }

    public void setSpotpassagePK(SpotpassagePK spotpassagePK) {
        this.spotpassagePK = spotpassagePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spotpassagePK != null ? spotpassagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spotpassage)) {
            return false;
        }
        Spotpassage other = (Spotpassage) object;
        if ((this.spotpassagePK == null && other.spotpassagePK != null) || (this.spotpassagePK != null && !this.spotpassagePK.equals(other.spotpassagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Spotpassage[ spotpassagePK=" + spotpassagePK + " ]";
    }
    
}
