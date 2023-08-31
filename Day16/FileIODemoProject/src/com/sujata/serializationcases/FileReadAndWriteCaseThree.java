package com.sujata.serializationcases;

import java.io.*;

public class FileReadAndWriteCaseThree {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream=new FileOutputStream("PersonData");

             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); ) {

            Address address=new Address(111,"My City","MyState");
            MyPerson myPerson=new MyPerson(101,"Ashima",address);

            objectOutputStream.writeObject(myPerson);
            System.out.println("File Created");


        }
        catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

        //====== Reading from the file

        try {
            FileInputStream fileInputStream=new FileInputStream("PersonData");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

            MyPerson person=(MyPerson) objectInputStream.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
