package JAVA_VOCA;

public class InnerStatic {
    int a = 10;
    private int b = 100;
    static int c = 200;

    static class InnerStatic2 {
        static int d = 1000;
        public void printInnerStaticData() {
//            System.out.println("int a : " + a); // error
//            System.out.println("private int b : " + b); // error
            System.out.println("static int c : " + c);
            System.out.println("static int d : " + d);
        }
    }
}
