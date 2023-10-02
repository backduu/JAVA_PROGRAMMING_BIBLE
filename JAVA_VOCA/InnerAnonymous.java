package JAVA_VOCA;

interface TestInter {
    int data = 10000;
    public void printAnonymousData();
}
public class InnerAnonymous {
    public void test () {
        new TestInter() {
            public void printAnonymousData() {
                System.out.println("data : " + data);
            }
        }.printAnonymousData();
    }
}
