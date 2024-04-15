// public class FirstExample{

//     public static void main(String[] args){
//         System.out.println("You are welcome to java class. This class promises to be exciting");
//     }
// }

// byte -128 -127
// short 2 bytes
// int 4 bytes
// long 8 bytes
// float 4 bytes
// double 8 bytes
// boolean 1 bit
// char 2 bytes

//     public static void main(String[] args){
// // int score = 50;
// // long newScore = score;
// // System.out.println(newScore);

// long newScore = 50;
// int anotherScore = (int)newScore;
// System.out.println(anotherScore);
//         // System.out.println("You are welcome to java class. This class promises to be exciting");

//         import java.util.Scanner;

//         Scanner = userInput = new Scanner(System.in);
//     }

// public class FirstExample {

//     // public static void main(String[] args) {
//     //     java.util.Scanner scanner = new java.util.Scanner(System.in);

//     //     // Ask for name and class courses
//     //     System.out.println("Enter your name:");
//     //     String name = scanner.nextLine();

//     //     System.out.println("Enter your class:");
//     //     String className = scanner.nextLine();

//     //     // Ask for 5 course scores
//     //     double[] courseScores = new double[5];
//     //     for (int i = 0; i < 5; i++) {
//     //         System.out.println("Enter score for Course " + (i + 1) + ":");
//     //         courseScores[i] = scanner.nextDouble();
//     //     }

//     //     // Calculate CGPA
//     //     double cgpa = calculateCGPA(courseScores);

//     //     // Display CGPA
//     //     System.out.println("Hello, Welcome " + name + "!");
//     //     System.out.println("Class: " + className);
//     //     System.out.println("Your CGPA is: " + cgpa);

//     //     scanner.close();
//     // }

//     // // Method to calculate CGPA
//     // public static double calculateCGPA(double[] scores) {
//     //     // Convert scores to grade points
//     //     double totalGradePoints = 0;
//     //     for (double score : scores) {
//     //         totalGradePoints += convertToGradePoint(score);
//     //     }

//     //     // Calculate CGPA (average grade points)
//     //     double cgpa = totalGradePoints / scores.length;
//     //     return cgpa;
//     // }

//     // // Method to convert score to grade point
//     // public static double convertToGradePoint(double score) {
//     //     if (score >= 70) {
//     //         return 5.0;
//     //     } else if (score >= 60) {
//     //         return 4.0;
//     //     } else if (score >= 50) {
//     //         return 3.0;
//     //     } else if (score >= 45) {
//     //         return 2.0;
//     //     } else if (score >= 40) {
//     //         return 1.0;
//     //     } else {
//     //         return 0.0;
//     //     }
//     // }

// public static void main(String[] args) {
//     String[] names = new String[5];
//     names[0] = "Joshua";
//     names[3] = "NID";
//     // names[1] = 'Bamidele';
//     // names[2] = 'NID ||';

//     // System.out.println(names[0]);
//     // String newAr = names.toString(); TO CONVERT AN ARRAY TO STRING.
//     // System.out.println(newArr);

//     // arFOR LOOP
//     //     for (int i = 0; i < names.length; i++) {
//     //     System.out.println(names[i]);
//     // }

//     // USING FOR EACH
//     // for(String name : names) {
//     //     System.out.println(name);
//     // }

//     String[][] values = new String[3][3];
//     values[1][2] = "Joshua";
//     values[0][0] = "Bam";
//     int[][] val = {{1,2,3,4, 5}, { 3,5,7,8,9}, {4,0,2,7,3}};
//         // System.out.println(val[1]);

//     //    for (int i = 0; i < val.length; i++){

//     //     System.out.println(val[i]);
//     //    }

//     // JAVA SWITCH CASE STATEMENT.
//      java.util.Scanner scanner = new java.util.Scanner(System.in);

//         // System.out.println("Who is the current President of Nigeria?");
//         // String name = scanner.nextLine();

//         // if (name.equals("Tinubu")) {
//         //     System.out.println("Correct! The current President of Nigeria is Bola Ahmed Tinubu.");
//         // } else {
//         //     System.out.println("Incorrect. The current President of Nigeria is Bola Ahmed Tinubu.");
//         // }

//         // String answer;
//         // System.out.println(x:  "The current President of Nigeria is _____ (a) Buhari  (b) Tinubu   (c) Jonathan (d) Obasanjo");
//         // Sting option = scanner.nextLine();

//         // switch(option){
//         //     case "a":
//         //     System.out.println(x : "Wrong!");
//         //     break;

//         //     case "b":
//         //     System.out.println(x : "Correct!");
//         //     break;

//         //     case "c":
//         //     System.out.println(x : "Wrong!");
//         //     break;

//         //     case "d":
//         //     System.out.println(x : "Wrong!");
//         //     break;

//         //     default :
//         //     System.out.println(x : "Wrong!");
//         //     break;
//         // } 

//          System.out.println("The current President of Nigeria is _____ (a) Buhari  (b) Tinubu   (c) Jonathan (d) Obasanjo");
//         String answer = scanner.nextLine();

//         switch (answer.toLowerCase()) {
//             case "a":
//                 System.out.println("Wrong!");
//                 break;

//             case "b":
//                 System.out.println("Correct!");
//                 break;

//             case "c":
//                 System.out.println("Wrong!");
//                 break;

//             case "d":
//                 System.out.println("Wrong!");
//                 break;

//             default:
//                 System.out.println("Invalid option!");
//                 break;
//         }

// }

//     // count<< "The current President of Nigeria is ________" <<endl;

// }

// JAVA METHOD
// NOTE: This method is used to prevent a particular function to be repeated.
// 1. Method Definition e.g public static void myMethod(){} or public int myMethod(int a){};
// 2. Method Declaration e.g {System.out.println("This is Java class")};
// 3. Method Invocation e.g myMethod() or myMethod(5);

// PARAMETIZED METHOD
import java.util.Scanner;

public class FirstExample {
    static Scanner na = new Scanner(System.in);

    public static void askName() {
        System.err.println("Please enter your name");
        String name = na.nextLine();
        System.err.println("My name is " + name);

        // System.out.println("JavaMethod");
    }

    public static void main(String[] args) {
        askName();
    }
}