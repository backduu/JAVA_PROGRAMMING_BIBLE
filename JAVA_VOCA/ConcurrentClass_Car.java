package JAVA_VOCA;

import java.util.*;

public class ConcurrentClass_Car {
    private List<String> carList = null;
    public ConcurrentClass_Car() {
        carList = new ArrayList<String>();
    }

    public String getCar() {
        String carName="";
        switch((int) (Math.random() * 3)) {
            case 0 : carName = "SM5";
            break;
            case 1 : carName = "Magnus";
            break;
            case 2: carName = "Karrens";
            break;
        }

        return carName;
    }

    // 차를 소비하는 메소드이며 이것을 동기화해야만 소비자의 차가 없는 대기 상태로 이동할 수 있다.
    public synchronized String pop() {
        String carName = null;
        if(carList.size() == 0) {
            try {
                System.out.println("There is no car in this factory.....please wait..");
                this.wait();
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        carName = (String) carList.remove(carList.size() - 1);
        System.out.println("Customer purchased A car!");
        System.out.println("The car name is...." + carName);

        return carName;
    }

    public synchronized void push(String car) {
        carList.add(car);
        System.out.println("차가 만들어 졌습니다...");
        System.out.println("차 이름은 " + car + " 입니다.");

        if(carList.size() == 5) {
            this.notify();
        }
    }
}
