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
@Table(name = "spotpicture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spotpicture.findAll", query = "SELECT s FROM Spotpicture s"),
    @NamedQuery(name = "Spotpicture.findBySpotId", query = "SELECT s FROM Spotpicture s WHERE s.spotpicturePK.spotId = :spotId"),
    @NamedQuery(name = "Spotpicture.findByPictureId", query = "SELECT s FROM Spotpicture s WHERE s.spotpicturePK.pictureId = :pictureId")})
public class Spotpicture implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SpotpicturePK spotpicturePK;

    public Spotpicture() {
    }

    public Spotpicture(SpotpicturePK spotpicturePK) {
        this.spotpicturePK = spotpicturePK;
    }

    public Spotpicture(int spotId, int pictureId) {
        this.spotpicturePK = new SpotpicturePK(spotId, pictureId);
    }

    public SpotpicturePK getSpotpicturePK() {
        return spotpicturePK;
    }

    public void setSpotpicturePK(SpotpicturePK spotpicturePK) {
        this.spotpicturePK = spotpicturePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spotpicturePK != null ? spotpicturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spotpicture)) {
            return false;
        }
        Spotpicture other = (Spotpicture) object;
        if ((this.spotpicturePK == null && other.spotpicturePK != null) || (this.spotpicturePK != null && !this.spotpicturePK.equals(other.spotpicturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Spotpicture[ spotpicturePK=" + spotpicturePK + " ]";
    }
    
}
