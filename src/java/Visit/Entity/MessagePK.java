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
public class MessagePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "leaver_name")
    private String leaverName;

    public MessagePK() {
    }

    public MessagePK(String userName, String leaverName) {
        this.userName = userName;
        this.leaverName = leaverName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLeaverName() {
        return leaverName;
    }

    public void setLeaverName(String leaverName) {
        this.leaverName = leaverName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        hash += (leaverName != null ? leaverName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MessagePK)) {
            return false;
        }
        MessagePK other = (MessagePK) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        if ((this.leaverName == null && other.leaverName != null) || (this.leaverName != null && !this.leaverName.equals(other.leaverName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.MessagePK[ userName=" + userName + ", leaverName=" + leaverName + " ]";
    }
    
}
