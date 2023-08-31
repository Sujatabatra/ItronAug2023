package com.sujata.serializationcases;

import java.io.Serializable;

public class NonSerializedPerson {

    private int pId;
    private String pName;

    public NonSerializedPerson(){

    }

    public NonSerializedPerson(int pId, String pName) {
        this.pId = pId;
        this.pName = pName;
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

    @Override
    public String toString() {
        return "SerialisedPerson{" +
                "pId=" + pId +
                ", pName=" + pName +
                '}';
    }
}
