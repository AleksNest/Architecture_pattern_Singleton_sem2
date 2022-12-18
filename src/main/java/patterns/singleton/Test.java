package patterns.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton.getInstance().echo();
        Singleton.getInstance().echo();
        Singleton.getInstance().massage();
    }
}
