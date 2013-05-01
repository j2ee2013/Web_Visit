/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visit.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author 猫的鱼儿
 */
@Embeddable
public class SpotpicturePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "spot_id")
    private int spotId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "picture_id")
    private int pictureId;

    public SpotpicturePK() {
    }

    public SpotpicturePK(int spotId, int pictureId) {
        this.spotId = spotId;
        this.pictureId = pictureId;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) spotId;
        hash += (int) pictureId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpotpicturePK)) {
            return false;
        }
        SpotpicturePK other = (SpotpicturePK) object;
        if (this.spotId != other.spotId) {
            return false;
        }
        if (this.pictureId != other.pictureId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.SpotpicturePK[ spotId=" + spotId + ", pictureId=" + pictureId + " ]";
    }
    
}
