public class OOP {
    String name, model, color, engine;

    public OOP() {
        name = "Toyota";
        model = "2013 CRV";
        color = "Ashe";
        engine = "V8";
        details();
    }

    public void details() {
        System.out
                .println(name + " is the " + model + " model. The color is " + color + " and the engine is " + engine);
        startEngine();
    }

    public void startEngine() {
        System.out.println("Engine started press turtle to move");
    }

    public static void main(String[] args) {
        OOP ca = new OOP();
        ca.details();
        // ca.name = "Ford";
        // System.out.println(ca.name);
    }
}
