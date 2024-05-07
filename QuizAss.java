import java.util.Scanner;

public class QuizAss {
    static Scanner na = new Scanner(System.in);

    public static void askName() {
        System.err.println("Please enter the names of the student that you want to do exams for.");
        String[] names = new String[5];
        na.nextLine();
        // USING FOR EACH
        // for (String name : names) {
        // System.out.println(name);
        // }
        // System.err.println(names);
        // System.err.println("My name is " + name);

    }

    // public static void main
    public static void main(String[] args) {
        askName();
        // System.out.println("Doing Well...");
    }
}