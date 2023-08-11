package com.sujata.entity;

import java.util.Objects;

public class Person {
    private int personId;
    private String personName;
    private int personAge;

    public Person(){

    }

    public Person(int personId, String personName, int personAge) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId && personAge == person.personAge && Objects.equals(personName, person.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, personName, personAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
