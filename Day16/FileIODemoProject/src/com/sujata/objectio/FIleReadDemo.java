package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FIleReadDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream=new FileInputStream("PersonDetails");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

            Person person=(Person)objectInputStream.readObject();
            System.out.println(person.getPersonId()+" "+person.getPersonName());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
