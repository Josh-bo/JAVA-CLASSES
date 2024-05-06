// import java.util.ArrayList; // We can use it when we only want to store data
// import java.util.Collections;

// public class JavaArrayList {
//     public static void main(String[] args) {
//         ArrayList<String> nos = new ArrayList<String>();
//         nos.add("Joshua");
//         nos.add("Bamidele");
//         nos.add("Tope");
//         nos.add("Sunday");

//         // System.out.println(nos.get(3)); // To get value of an array.
//         // nos.set(2, "Titi"); // To change value of an ArrayList.
//         // nos.remove(1); // To remove a value from an ArrayList.
//         // nos.clear(); // To empty an ArrayList.
//         // nos.size(); // To get the length of an ArrayList.

//         // To loop over an ArrayList.
//         // FOR LOOP.
//         // for (int i = 0; i < nos.size(); i++) {
//         // System.out.println(nos.get(i));
//         // }

//         // // FOR EACH LOOP.
//         // for (String name : nos) {
//         // // System.out.println(name);
//         // System.out.println("Second for loop coming in" + name);
//         // }

//         ArrayList<Integer> age = new ArrayList<Integer>();
//         ArrayList<Boolean> status = new ArrayList<Boolean>();
//         ArrayList<Character> option = new ArrayList<Character>();
//         ArrayList<Double> score = new ArrayList<Double>();

//         age.add(20);
//         age.add(25);
//         age.add(22);
//         age.add(15);
//         age.add(11);
//         age.add(19);

//         Collections.sort(age);
//         for (String name : nos) {
//             System.out.println(name);
//         }
//     }
// }

//  TO USE LINKED-LIST METHOD
import java.util.LinkedList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        LinkedList<String> nos = new LinkedList<String>();
        nos.add("Joshua");
        nos.add("Bamidele");
        nos.add("Tope");
        nos.add("Sunday");

        // other code...

        LinkedList<Integer> age = new LinkedList<Integer>();
        LinkedList<Boolean> status = new LinkedList<Boolean>();
        LinkedList<Character> option = new LinkedList<Character>();
        LinkedList<Double> score = new LinkedList<Double>();

        age.add(20);
        age.add(25);
        age.add(22);
        age.add(15);
        age.add(11);
        age.add(19);

        Collections.sort(age);
        for (String name : nos) {
            System.out.println(name);
        }
        age.addFirst(45);
        age.addLast(43);
        age.removeFirst();
        age.removeLast();
        int first = age.getFirst();
        int last = age.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}
