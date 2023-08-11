package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileOpen{
    private String fileName;

    public FileOpen(String fileName) {
        this.fileName = fileName;
    }

    public void openFile()throws FileNotFoundException{
//        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
//            System.out.println("File Opened");
//        }
//        catch(FileNotFoundException exception){
//            System.out.println(fileName+" file doesnot exist");
//        }
    }
}
public class ThrowsDemoClass {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Enter File Name : ");
            FileOpen fileOpen = new FileOpen(scanner.next());
            fileOpen.openFile();
            System.out.println("File Open for reading");
        }
        catch(FileNotFoundException exception){
            System.out.println("Kindly give correct file name");
        }
    }
}
