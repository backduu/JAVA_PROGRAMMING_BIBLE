package Inheritance;

public class Cellphone {
    String model;
    String number;
    int chord;

    public Cellphone(int i) {
        System.out.println("super 클래스 호출 => " + i);
    }

    public void setNumber(String n) {
        number = n;
    }
    public String getModel() {
        return model;
    }
    public int getChord() {
        return chord;
    }

    public String getNumber() {
        return number;
    }

    String parentMsg = "Parent Class"; // 오버라이딩하여 보여줄 부모의 메시지
    public String getMsg() {
        return parentMsg;
    }
}
