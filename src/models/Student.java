package models;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.scene.image.Image;

/*
Application Purpose: create an application that displays the name, surname, student number, and his interests
Author: Illia Kucheruk
Date:08.02.2021
Time: 5:09
 */
public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;
    private Image myImage;
    private ArrayList<String> interests;

    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> interests) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interests);
        setMyImage();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        if ( firstName.length()>2) {
            this.firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        }
        else
            throw new IllegalArgumentException("Error! Please write your name with more then 2 characters");
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()<=2){
            throw new IllegalArgumentException("Error! Please write your last name with more then 2 characters");
        }
        else
            this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if ( studentNumber >= 100000000 && studentNumber<= 999999999){
            this.studentNumber = studentNumber;
        }
        else
            throw new IllegalArgumentException("Error! Please enter your number between 100000000 and 999999999");
    }

    public void setMyImage(){
        String filePath = "images/img.jpg";
        myImage = new Image(filePath);
    }

    public ArrayList<String> getInterest() {
        return this.interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public Image getMyImage(){
        return myImage;
    }
}
