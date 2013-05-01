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
import javax.validation.constraints.Size;

/**
 *
 * @author 猫的鱼儿
 */
@Embeddable
public class CommentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "passage_id")
    private int passageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "user_name")
    private String userName;

    public CommentPK() {
    }

    public CommentPK(int passageId, String userName) {
        this.passageId = passageId;
        this.userName = userName;
    }

    public int getPassageId() {
        return passageId;
    }

    public void setPassageId(int passageId) {
        this.passageId = passageId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) passageId;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommentPK)) {
            return false;
        }
        CommentPK other = (CommentPK) object;
        if (this.passageId != other.passageId) {
            return false;
        }
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.CommentPK[ passageId=" + passageId + ", userName=" + userName + " ]";
    }
    
}
