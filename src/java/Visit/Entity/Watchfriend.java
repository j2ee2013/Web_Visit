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
@Table(name = "watchfriend")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Watchfriend.findAll", query = "SELECT w FROM Watchfriend w"),
    @NamedQuery(name = "Watchfriend.findByWatchName", query = "SELECT w FROM Watchfriend w WHERE w.watchfriendPK.watchName = :watchName"),
    @NamedQuery(name = "Watchfriend.findByWatchedName", query = "SELECT w FROM Watchfriend w WHERE w.watchfriendPK.watchedName = :watchedName")})
public class Watchfriend implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WatchfriendPK watchfriendPK;

    public Watchfriend() {
    }

    public Watchfriend(WatchfriendPK watchfriendPK) {
        this.watchfriendPK = watchfriendPK;
    }

    public Watchfriend(String watchName, String watchedName) {
        this.watchfriendPK = new WatchfriendPK(watchName, watchedName);
    }

    public WatchfriendPK getWatchfriendPK() {
        return watchfriendPK;
    }

    public void setWatchfriendPK(WatchfriendPK watchfriendPK) {
        this.watchfriendPK = watchfriendPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (watchfriendPK != null ? watchfriendPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Watchfriend)) {
            return false;
        }
        Watchfriend other = (Watchfriend) object;
        if ((this.watchfriendPK == null && other.watchfriendPK != null) || (this.watchfriendPK != null && !this.watchfriendPK.equals(other.watchfriendPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Watchfriend[ watchfriendPK=" + watchfriendPK + " ]";
    }
    
}
