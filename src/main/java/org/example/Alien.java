package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Vipul Chauhan on 12/02/22
 * @project hibernate-learning
 */
@Entity
public class Alien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aId;

    private String aName;

    private String aColor;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaColor() {
        return aColor;
    }

    public void setaColor(String aColor) {
        this.aColor = aColor;
    }

}
