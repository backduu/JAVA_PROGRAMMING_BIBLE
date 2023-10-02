package JAVA_VOCA;

abstract class TestAbst {
    int data = 10000;
    public abstract void printInnerAnonymouseData();
}
public class InnerAnonymous_2 {
    TestAbst inn = new TestAbst() {
        @Override
        public void printInnerAnonymouseData() {
            System.out.println("data_2 : " + data);
        }
    };
}
