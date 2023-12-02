package JAVA_VOCA;


// ** 생산자와 소비자 클래스는 공유자원으로 ConcurrentClass_Car 클래스를 공유한다.
public class ConcurrentClass_Producer implements Runnable{
    private ConcurrentClass_Car car;

    public ConcurrentClass_Producer(ConcurrentClass_Car car) {
        this.car = car;
    }

    public void run() {
        String carName = null;
        for(int i = 0; i < 20; i++ ) {
            carName = car.getCar();
            car.push(carName);
            try {
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
