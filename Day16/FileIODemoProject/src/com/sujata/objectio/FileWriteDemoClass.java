package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriteDemoClass {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream=new FileOutputStream("PersonDetails");

             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); ) {

            Person person=new Person(101,"AAA");

            objectOutputStream.writeObject(person);
            System.out.println("File Created");


        }
        catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


    }
}
