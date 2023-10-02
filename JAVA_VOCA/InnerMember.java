package JAVA_VOCA;

public class InnerMember {
    int a = 10;
    private int b = 100;
    static int c = 200;

    class Inner {
        public void printInnerClassData() {
            System.out.println("int a : " + a);
            System.out.println("private int b : " + b);
            System.out.println("static int c : " + c);
        }
    }
}
