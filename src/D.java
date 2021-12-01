
public class D {
    public static void main(String[] args) {
        A a = new B();
        a.m();
    }
}

class A {

    protected static String hack = "HackerRank";

    public void m() {
        System.out.print("A");
    }

}
class B extends A {
    public void m() {
        System.out.print("B");
        hack = "Hacker";
    }
}

class C extends B {
    public void m(){
        hack;
    }
}
