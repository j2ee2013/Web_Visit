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
public class PassagepicturePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "passage_id")
    private int passageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "picture_id")
    private int pictureId;

    public PassagepicturePK() {
    }

    public PassagepicturePK(int passageId, int pictureId) {
        this.passageId = passageId;
        this.pictureId = pictureId;
    }

    public int getPassageId() {
        return passageId;
    }

    public void setPassageId(int passageId) {
        this.passageId = passageId;
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
        hash += (int) passageId;
        hash += (int) pictureId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PassagepicturePK)) {
            return false;
        }
        PassagepicturePK other = (PassagepicturePK) object;
        if (this.passageId != other.passageId) {
            return false;
        }
        if (this.pictureId != other.pictureId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.PassagepicturePK[ passageId=" + passageId + ", pictureId=" + pictureId + " ]";
    }
    
}
