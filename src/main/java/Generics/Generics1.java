package Generics;

public class Generics1 {
}

class Class1<T extends A & Interface> {


    private <M extends Number> void print(M m, T t) {
        System.out.println("key " + m + ", equal " + t);
    }

    public static void main(String[] args) {
        Class1<A> class1 = new Class1<A>();
        class1.print(1, new A());
    }
}

interface Interface {
}

class A implements Interface {
    @Override
    public String toString() {
        return " | Class A";
    }
}

class B extends A implements Interface {
}

