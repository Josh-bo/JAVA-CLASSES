import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        String condition = "String";

        switch (condition) {
            case "Integer":
                IntegerFunction();
                break;
            case "Boolean":
                BooleanFunction();
            case "String":
                StringFunction();
            default:
                System.out.println("Condition not recognized");
        }

        // System.out.println("Good to go");

    }

    // IntegerFunction;
    public static void IntegerFunction() {
        HashMap<String, Integer> inst_age = new HashMap<String, Integer>();
        inst_age.put("Yemi", 28);
        inst_age.put("Blessing", 34);
        inst_age.put("Titilayo", 35);

        for (String name : inst_age.keySet()) {
            int age = inst_age.get(name);
            System.out.println(name + " : " + age);
        }
    }

    // BooleanFunction;
    public static void BooleanFunction() {
        HashMap<String, Boolean> inst_status = new HashMap<String, Boolean>();
        inst_status.put("Yemi", true);
        inst_status.put("Blessing", false);

        for (String name : inst_status.keySet()) { // Corrected the loop variable type to String
            boolean status = inst_status.get(name); // Using the key to get the status value
            System.out.println(name + " : " + status);
        }
    }

    // StringFunction;
    public static void StringFunction() {
        HashMap<String, String> course_instructor = new HashMap<String, String>();
        course_instructor.put("Java", "Yemi");
        course_instructor.put("PM", "Mr Blessing");
        course_instructor.put("HTML", "No man");
        course_instructor.put("Python", "Yemi");
        course_instructor.put("Product Design", "Titilayo");

        course_instructor.get("Java"); // To get the value be the get method.
        // course_instructor.remove("HTML"); //To remove the value be the remove method.
        // course_instructor.clear(); //To clear
        course_instructor.size(); // To get the size.

        // To get the keySet.
        for (String course : course_instructor.keySet()) {
            System.out.println(course);
        }

        // To display the values.
        for (String course : course_instructor.values()) {
            System.out.println(course);
        }

        // To display the values and the keySet.
        for (String course : course_instructor.keySet()) {
            System.out.println("Course: " + course + " Instructor: " +
                    course_instructor.get(course));
        }
        // System.out.println(course_instructor);
    }

}