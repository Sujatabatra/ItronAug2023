package com.sujata.serializationcases;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//When the base class is serialized then all the dervied classes are also Serialized
public class NonSerializedEmployee extends SerialisedPerson{
    private String deptt;
    private double salary;

    public NonSerializedEmployee(){

    }

    public NonSerializedEmployee(int pId, String pName, String deptt, double salary) {
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
        return "NonSerializedEmployee{" +
                "deptt='" + deptt + '\'' +
                ", salary=" + salary +
                '}';
    }

    private void writeObject(ObjectOutputStream objectOutputStream)throws NotSerializableException{
        throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException{
        throw new NotSerializableException();
    }
}
