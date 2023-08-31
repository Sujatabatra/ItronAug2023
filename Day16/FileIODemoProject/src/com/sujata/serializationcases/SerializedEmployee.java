package com.sujata.serializationcases;

import java.io.*;

//When the base class is not serialized and derived class is  Serialized
public class SerializedEmployee extends NonSerializedPerson implements Serializable {


    private String deptt;
    private double salary;

    public SerializedEmployee(){

    }

    public SerializedEmployee(int pId, String pName, String deptt, double salary) {
        super(pId, pName);
        this.deptt = deptt;
        this.salary = salary;
    }

    public String getDeptt() {
        return deptt;
    }

    public void setDeptt(String deptt) {
        this.deptt = deptt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SerializedEmployee{" +
                "person id= "+getpId()+"  person name= "+getpName()+
                "deptt='" + deptt + '\'' +
                ", salary=" + salary +
                '}';
    }

    private void readObject(ObjectInputStream objectInputStream)throws ClassNotFoundException, IOException{
        objectInputStream.defaultReadObject();
        setpId((int)objectInputStream.readObject());
        setpName((String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream)throws ClassNotFoundException,IOException{
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getpId());
        objectOutputStream.writeObject(getpName());
    }


}
