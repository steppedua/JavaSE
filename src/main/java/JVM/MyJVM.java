package JVM;

public class MyJVM {
    private Spoon spoon;

    public MyJVM(Spoon spoon) {
        this.spoon = spoon;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Чашка исчезает навсегда");
    }

    public static void main(String[] args) {
        MyJVM myJVM = new MyJVM(new Spoon());
        myJVM = null;
        System.gc();
    }
}

class Spoon {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ложка исчезает навсегда");
    }
}

