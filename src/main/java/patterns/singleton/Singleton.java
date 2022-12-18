package patterns.singleton;

public class Singleton {
    private static Singleton instance;


    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {}          // default constructor

    public void echo() {
        System.out.println(instance);
    }

    public void massage () {
        System.out.println("massage");
    }

}
