/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visit.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 猫的鱼儿
 */
@Entity
@Table(name = "spot")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spot.findAll", query = "SELECT s FROM Spot s"),
    @NamedQuery(name = "Spot.findBySpotId", query = "SELECT s FROM Spot s WHERE s.spotId = :spotId"),
    @NamedQuery(name = "Spot.findBySpotName", query = "SELECT s FROM Spot s WHERE s.spotName = :spotName"),
    @NamedQuery(name = "Spot.findByGrade", query = "SELECT s FROM Spot s WHERE s.grade = :grade"),
    @NamedQuery(name = "Spot.findByClassification", query = "SELECT s FROM Spot s WHERE s.classification = :classification")})
public class Spot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "spot_id")
    private Integer spotId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "spot_name")
    private String spotName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "spot_introduction")
    private String spotIntroduction;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grade")
    private int grade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "classification")
    private String classification;

    public Spot() {
    }

    public Spot(Integer spotId) {
        this.spotId = spotId;
    }

    public Spot(Integer spotId, String spotName, String spotIntroduction, int grade, String classification) {
        this.spotId = spotId;
        this.spotName = spotName;
        this.spotIntroduction = spotIntroduction;
        this.grade = grade;
        this.classification = classification;
    }

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public String getSpotIntroduction() {
        return spotIntroduction;
    }

    public void setSpotIntroduction(String spotIntroduction) {
        this.spotIntroduction = spotIntroduction;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (spotId != null ? spotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spot)) {
            return false;
        }
        Spot other = (Spot) object;
        if ((this.spotId == null && other.spotId != null) || (this.spotId != null && !this.spotId.equals(other.spotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Spot[ spotId=" + spotId + " ]";
    }
    
}
