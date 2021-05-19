package com.example.springbootjpa2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {

    @Id
    private int aid;
    private String aname;
    private String tech;

    public Alien()
    {

    }

    public Alien(int aid, String aname, String tech) {
        this.aid = aid;
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Alien [aid=");
        sb.append(aid);
        sb.append(", aname=");
        sb.append(aname);
        sb.append(", tech=");
        sb.append(tech);
        sb.append("]");
        return sb.toString();
    }
}
