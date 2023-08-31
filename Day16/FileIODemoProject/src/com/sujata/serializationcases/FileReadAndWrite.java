package com.sujata.serializationcases;

import java.io.*;

public class FileReadAndWrite {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream=new FileOutputStream("PersonData");

             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); ) {

            Person person=new Person(101,"AAA",45);

            objectOutputStream.writeObject(person);
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

            Person person=(Person)objectInputStream.readObject();
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
