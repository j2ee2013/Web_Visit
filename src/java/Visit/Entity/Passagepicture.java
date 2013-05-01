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
@Table(name = "passagepicture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passagepicture.findAll", query = "SELECT p FROM Passagepicture p"),
    @NamedQuery(name = "Passagepicture.findByPassageId", query = "SELECT p FROM Passagepicture p WHERE p.passagepicturePK.passageId = :passageId"),
    @NamedQuery(name = "Passagepicture.findByPictureId", query = "SELECT p FROM Passagepicture p WHERE p.passagepicturePK.pictureId = :pictureId")})
public class Passagepicture implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PassagepicturePK passagepicturePK;

    public Passagepicture() {
    }

    public Passagepicture(PassagepicturePK passagepicturePK) {
        this.passagepicturePK = passagepicturePK;
    }

    public Passagepicture(int passageId, int pictureId) {
        this.passagepicturePK = new PassagepicturePK(passageId, pictureId);
    }

    public PassagepicturePK getPassagepicturePK() {
        return passagepicturePK;
    }

    public void setPassagepicturePK(PassagepicturePK passagepicturePK) {
        this.passagepicturePK = passagepicturePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passagepicturePK != null ? passagepicturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passagepicture)) {
            return false;
        }
        Passagepicture other = (Passagepicture) object;
        if ((this.passagepicturePK == null && other.passagepicturePK != null) || (this.passagepicturePK != null && !this.passagepicturePK.equals(other.passagepicturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Passagepicture[ passagepicturePK=" + passagepicturePK + " ]";
    }
    
}
