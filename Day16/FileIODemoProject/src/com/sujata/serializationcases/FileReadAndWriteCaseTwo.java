package com.sujata.serializationcases;

import java.io.*;

public class FileReadAndWriteCaseTwo {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream=new FileOutputStream("PersonData");

             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); ) {

            SerializedEmployee nonSerializedEmployee=new SerializedEmployee(1,"ABC","Sales",7890.0);

            objectOutputStream.writeObject(nonSerializedEmployee);
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

            SerializedEmployee person=(SerializedEmployee) objectInputStream.readObject();
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
