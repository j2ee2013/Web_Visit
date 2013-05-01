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
@Table(name = "passage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passage.findAll", query = "SELECT p FROM Passage p"),
    @NamedQuery(name = "Passage.findByPassageId", query = "SELECT p FROM Passage p WHERE p.passageId = :passageId"),
    @NamedQuery(name = "Passage.findByPassageName", query = "SELECT p FROM Passage p WHERE p.passageName = :passageName"),
    @NamedQuery(name = "Passage.findByUserName", query = "SELECT p FROM Passage p WHERE p.userName = :userName"),
    @NamedQuery(name = "Passage.findByGrade", query = "SELECT p FROM Passage p WHERE p.grade = :grade"),
    @NamedQuery(name = "Passage.findByTag1", query = "SELECT p FROM Passage p WHERE p.tag1 = :tag1"),
    @NamedQuery(name = "Passage.findByTag2", query = "SELECT p FROM Passage p WHERE p.tag2 = :tag2"),
    @NamedQuery(name = "Passage.findByTag3", query = "SELECT p FROM Passage p WHERE p.tag3 = :tag3")})
public class Passage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "passage_id")
    private Integer passageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "passage_name")
    private String passageName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grade")
    private int grade;
    @Size(max = 45)
    @Column(name = "tag1")
    private String tag1;
    @Size(max = 45)
    @Column(name = "tag2")
    private String tag2;
    @Size(max = 45)
    @Column(name = "tag3")
    private String tag3;

    public Passage() {
    }

    public Passage(Integer passageId) {
        this.passageId = passageId;
    }

    public Passage(Integer passageId, String passageName, String userName, String content, int grade) {
        this.passageId = passageId;
        this.passageName = passageName;
        this.userName = userName;
        this.content = content;
        this.grade = grade;
    }

    public Integer getPassageId() {
        return passageId;
    }

    public void setPassageId(Integer passageId) {
        this.passageId = passageId;
    }

    public String getPassageName() {
        return passageName;
    }

    public void setPassageName(String passageName) {
        this.passageName = passageName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passageId != null ? passageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passage)) {
            return false;
        }
        Passage other = (Passage) object;
        if ((this.passageId == null && other.passageId != null) || (this.passageId != null && !this.passageId.equals(other.passageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Visit.Entity.Passage[ passageId=" + passageId + " ]";
    }
    
}
