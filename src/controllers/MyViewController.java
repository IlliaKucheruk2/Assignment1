package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import models.Student;



public class MyViewController implements Initializable {
    @FXML
    private Label firstName;
    @FXML
    private Label lastName;
    @FXML
    private Label studentNumber;
    @FXML
    private ImageView imageView;
    @FXML
    private TextArea interests;

    private Student student;



    public void initialize(URL url, ResourceBundle resourceBundle) {
    ArrayList<String> interest = new ArrayList<>();//create an ArrayList of our interest
    interest.add("football");
    interest.add("basketball");
    interest.add("tennis");

    student = new Student("Illia", "Kucheruk", 200453638, interest);

    firstName.setText(student.getFirstName());
    lastName.setText(student.getLastName());
    studentNumber.setText(Integer.toString(student.getStudentNumber()));
    imageView.setImage(student.getMyImage());
    interests.setText(String.join("\n",student.getInterest()));


    }

}
