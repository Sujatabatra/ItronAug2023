package com.sujata.serializationcases;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyPerson implements Serializable {
    private int pId;
    private String pName;
    transient private Address address;

    public MyPerson(){

    }

    public MyPerson(int pId, String pName, Address address) {
        this.pId = pId;
        this.pName = pName;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MyPerson{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", address=" + address +
                '}';
    }

    private void writeObject(ObjectOutputStream objectOutputStream)throws IOException,ClassNotFoundException{
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(address.getHouseNo());
        objectOutputStream.writeObject(address.getCity());
        objectOutputStream.writeObject(address.getState());
    }

    private void readObject(ObjectInputStream objectInputStream)throws IOException,ClassNotFoundException{
        objectInputStream.defaultReadObject();
        address=new Address((int)objectInputStream.readObject(),(String)objectInputStream.readObject(),(String) objectInputStream.readObject());
    }
}
