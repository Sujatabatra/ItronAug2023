package com.sujata.entity;

import java.util.Objects;

public class MyPerson implements Comparable<MyPerson> {
    private int personId;
    private String personName;
    private int personAge;

    public MyPerson(){

    }

    public MyPerson(int personId, String personName, int personAge) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPerson myPerson = (MyPerson) o;
        return personId == myPerson.personId && personAge == myPerson.personAge && Objects.equals(personName, myPerson.personName);
    }



    @Override
    public int compareTo(MyPerson o) {
        if(this.equals(o))
            return 0;
        else if(this.personAge>o.getPersonAge())
            return 1;
        else
        return -1;
    }
}
