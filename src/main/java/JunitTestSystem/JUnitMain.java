package JunitTestSystem;

public class JUnitMain {
    public static void main(String[] args) {
        JUnitMain jUnitMain = new JUnitMain();
        System.out.println(jUnitMain.calA(2, 2));
    }

    public int calA(int a, int b) {
        return a + b;
    }
}