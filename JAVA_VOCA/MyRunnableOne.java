package JAVA_VOCA;

public class MyRunnableOne  implements Runnable{
/*    public void run() {
        System.out.println("run");
        first();
    }

    public void first() {
        System.out.println("first");
        second();
    }

    private void second() {
        System.out.println("second");
    }*/
    public void run() {
        int first = 0;
        int second = 0;
        for(int i = 0; i < 20; i++) {
            first++;
            second++;
            System.out.printf("first: %d " , first);
            System.out.printf("second : %d ", second);
            System.out.printf("thread name : %s %n" , Thread.currentThread().getName());
        }
    }
}
