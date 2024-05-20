// Extending Thread Class.
//Implement the Runnable class

public class JavaThread extends Thread {

    public void run() {
        String[] name = ["Sunday", "Tolu", "Ade", "Micheal", "John", "Abel", "Mama" ]
        for(String na : name){
            System.out.println("This Code is running on a thread " + na);

        }
    }

    public static void mainMethod() {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : number)
            System.out.println("This Code is running without a thread " + i);
    }

    public static void main(String[] args) {
        JavaThread thread1 = new JavaThread();
        thread1.start();
        mainMethod();
    }
}
