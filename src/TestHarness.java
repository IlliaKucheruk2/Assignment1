import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your name:");
        String firstName = sc.nextLine();


        System.out.println("Write your last name:");
        String lastName = sc.nextLine();

        System.out.println("Write your studentId:");
        int studentId = Integer.parseInt(sc.nextLine());

        System.out.println("Write your interests (separated by <,> sign):");
        String interests = sc.nextLine();

        Student st = new Student(firstName, lastName, studentId);

        List<String> interestsArray = Arrays.asList(interests.split(","));

        for (int i = 0; i < interestsArray.size(); i++) {
            String addResult = st.addInterest(interestsArray.get(i));
            if (!addResult.equals(""))
                System.out.println(addResult);
        }

        System.out.println("Your name is: "+ st.getFirst_name());
        System.out.println("Your surname is: "+ st.getLast_name());
        System.out.println("Your ID is: "+ st.getStudent_number());

    }


}
