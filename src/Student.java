import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Application Purpose: creates a class that check if the info is true
Author: Illia Kucheruk
Date:08.02.2021
Time: 2:09
 */
public class Student {
    //create a private varibles
    private String first_name;
    private String last_name;
    private int student_number;
    private ArrayList<String> interests = new ArrayList<>();

    private int bonus;

    //create a constructor
    public Student(String first_name, String last_name, int student_number) {
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setStudent_number(student_number);
    }

    private static List<String> getInterestsInternal() {
        return Arrays.asList("hiking","skiing","reading","coding","gaming");
    }

    public String addInterest(String interest) {
        String trimedString =  interest.trim();
        if (trimedString  == "")
            return ("error - empty input");
        if (!getInterestsInternal().contains(trimedString))
            return ( "error - intereset not in the default list ( " + trimedString  + " )");
        if (interests.contains(trimedString))
            return ("error - already in the default list of interests ( " + trimedString  + " )");

        interests.add(trimedString);

        return "";
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    //cheking if our first name is written without blanks and more then 2 characters
    public String getFirst_name() {

        return first_name;
    }

    public void setFirst_name(String first_name) {
        first_name = first_name.toUpperCase();//make it in UpperCase
        int first_number = first_name.length();//translate to String
        if(first_name.contains(" ")||(first_number<=2)){
            throw new IllegalArgumentException("Enter your real first name!");
        }
        else
        this.first_name = first_name;
    }
    //cheking if our last name is written without blanks and more then 2 characters
    public String getLast_name() {

        return last_name;
    }

    public void setLast_name(String last_name) {
        last_name = last_name.toUpperCase();//make it in UpperCase
        int last_number = last_name.length();//translate to String
        if(last_name.contains(" ")||((last_number<=2))){
                throw new IllegalArgumentException("Enter your real last name!");
        }
        else
        this.last_name = last_name;
    }
    //cheking if student number is 9 digits
    public int getStudent_number() {

        return student_number;
    }

    public void setStudent_number(int student_number) {
        int numb_length = String.valueOf(student_number).length();
        if(numb_length!=9){
            throw new IllegalArgumentException("Enter your real student number!");
        }
        else
        this.student_number = student_number;
    }
}
