package JAVA_VOCA;

public class ConcurrentClass_Customer implements Runnable{
    private ConcurrentClass_Car car;
    public ConcurrentClass_Customer(ConcurrentClass_Car car) {
        this.car = car;
    }

    public void run() {
        String carName = null;
        for(int i = 0; i < 20; i++) {
            carName = car.pop();
            try {
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
