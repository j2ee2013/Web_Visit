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
public class SpotpassagePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "passage_id")
    private int passageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "spot_id")
    private int spotId;

    public SpotpassagePK() {
    }

    public SpotpassagePK(int passageId, int spotId) {
        this.passageId = passageId;
        this.spotId = spotId;
    }

    public int getPassageId() {
        return passageId;
    }

    public void setPassageId(int passageId) {
        this.passageId = passageId;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) passageId;
        hash += (int) spotId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SpotpassagePK)) {
            return false;
        }
        SpotpassagePK other = (SpotpassagePK) object;
        if (this.passageId != other.passageId) {
            return false;
        }
        if (this.spotId != other.spotId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.SpotpassagePK[ passageId=" + passageId + ", spotId=" + spotId + " ]";
    }
    
}
