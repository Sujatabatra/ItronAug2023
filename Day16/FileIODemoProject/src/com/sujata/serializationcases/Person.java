package com.sujata.serializationcases;

import java.io.Serializable;

public class Person implements Serializable {
    private final static long serialVersionUID=1L;

    private int pId;
    private String pName;
    transient private int pAge;

    public Person(){

    }

    public Person(int pId, String pName, int pAge) {
        this.pId = pId;
        this.pName = pName;
        this.pAge = pAge;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pAge=" + pAge +
                '}';
    }
}
