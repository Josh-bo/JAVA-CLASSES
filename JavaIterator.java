import java.util.ArrayList;
import java.util.Iterator;

public class javaIterator {

    // public static void main(String[] args) {
    // ArrayList<String> list_of_students = new ArrayList<String>();
    // list_of_students.add("A");
    // list_of_students.add("B");
    // list_of_students.add("Jinad");
    // list_of_students.add("Jina");
    // list_of_students.add("Jiad");
    // list_of_students.add("Jnad");
    // list_of_students.add("Jinad");
    // list_of_students.add("inad");
    // list_of_students.add("Jina");
    // list_of_students.add("Jinad");
    // Iterator<String> it = list_of_students.iterator();
    // // while ((it.hasNext())) {
    // // System.out.println(it.next());
    // // }
    // while ((it.hasNext())) {
    // String na = it.next();
    // if (na.equals("Jinad")) {
    // it.remove();
    // }
    // System.out.println(list_of_students);
    // }
    // }

    // Premitive Data type Wrapper class
    // byte byte
    // short short
    // int Integer
    // long long
    // float Float
    // double Double
    // Boolean Boolean
    // char Character

    // compile time error - throws up while the code is complying it could be
    // referred to as syntax error
    // shows the error
    // makes sure you fix the error etc.

    // Runtime error - this are usually hidden errors while or after the code has
    // gone for production usually the code or app would now be divided into
    // versions, or weekly to monthly updates of the application

    // Java exception: the use of try and catc

    public static void main(String[] args) {

        Integer age = 45;
        Double score = 87.4;
        Character option = 'A';
        String name = "Jinad";
        Boolean status = true;

        System.out.println(age.intValue());
        System.out.println(score.doubleValue());
        System.out.println(option.charValue());
        System.out.println(status.booleanValue());

        System.out.println(age.toString());
        System.out.println(name.length());
    }
}