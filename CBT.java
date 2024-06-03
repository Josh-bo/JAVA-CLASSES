
import java.util.Scanner;

public class CBT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        firstStart();
    }

    public static void firstStart() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Application!");
        System.out.println("1 - Start the Application");
        System.out.println("2 - Quit the Application");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                startApplication(scanner);
                break;
            case 2:
                System.out.println("Exiting the Application. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Exiting the Application.");
        }
    }

    public static void startApplication(Scanner scanner) {
        System.out.println("What would you like to do?");
        System.out.println("1 - Calculate CGPA");
        System.out.println("2 - Take a CBT Test");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateCGPA(scanner);
                break;
            case 2:
                createCBTTest(scanner);
                break;
            default:
                System.out.println("Invalid choice. Exiting the Application.");
        }
    }

    // TO COLLECT INFO TO CALCULATE CGPA.
    public static void calculateCGPA(Scanner scanner) {
        System.out.println("WELCOME TO MY CGPA CALCULATOR APPLICATION USING JAVA");
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("KINDLY ENTER YOUR NAME :=>");
        String name = scanner.nextLine();
        System.out.println("KINDLY ENTER YOUR DEPARTMENT :=>");
        String className = scanner.nextLine();

        // Define the number of courses
        System.out.println("Enter the number of courses:");
        int numCourses = scanner.nextInt();
        double[] courseScores = new double[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter score for Course " + (i + 1) + ":");
            courseScores[i] = scanner.nextDouble();
        }

        // Calculate CGPA
        double cgpa = calculateCGPA(courseScores);

        // Display CGPA
        System.out.println("Hello " + name + "!");
        System.out.println("Class: " + className);
        System.out.println("Your CGPA is: " + cgpa);
        firstStart();

    }

    // Method to calculate CGPA
    public static double calculateCGPA(double[] scores) {
        // Convert scores to grade points
        double totalGradePoints = 0;
        for (double score : scores) {
            totalGradePoints += convertToGradePoint(score);
        }

        // Calculate CGPA (average grade points)
        double cgpa = totalGradePoints / scores.length;
        return cgpa;
    }

    // Method to convert score to grade point
    public static double convertToGradePoint(double score) {
        if (score >= 70) {
            return 5.0;
        } else if (score >= 60) {
            return 4.0;
        } else if (score >= 50) {
            return 3.0;
        } else if (score >= 45) {
            return 2.0;
        } else if (score >= 40) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    public static void createCBTTest(Scanner scanner) {
        String[] questions = {
                "What is React?",
                "What is Angular?",
                "What is Vue.js?"
        };

        String[] answers = {
                "React is a JavaScript library for building user interfaces.",
                "Angular is a TypeScript-based open-source web application framework led by the Angular Team at Google.",
                "Vue.js is an open-source model–view–viewmodel front end JavaScript framework for building user interfaces and single-page applications."
        };

        System.out.println("Welcome to the Computer-Based Test (CBT)!");
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int studentIndex = 1; studentIndex <= numStudents; studentIndex++) {
            System.out.println("Enter details for Student " + studentIndex + ":");
            System.out.print("Enter your Username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your Matric Number: ");
            String matricNumber = scanner.nextLine();
            int totalScore = 0;
            for (int questionIndex = 0; questionIndex < questions.length; questionIndex++) {
                System.out.println(
                        "Student " + username + ", Question " + (questionIndex + 1) + ": " + questions[questionIndex]);
                System.out.print("Your answer: ");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(answers[questionIndex])) {
                    totalScore++;
                }
            }
            System.out.println("Congrats," + username + " with Matric Number " + matricNumber + " scored: " + totalScore
                    + " out of " + questions.length);
        }
    }
}
