package Inheritance;

public class D_caPhone extends Cellphone{
    String pixel;
    String childMsg = "Child 클래스";  // 오버라이딩하여 보여줄 자식의 메시지

    public String getMsg() {
        return childMsg;
    }
    public D_caPhone(String model, String num, int chord, String pixel) {
        this.model = model;
        number = num;
        this.chord = chord;
        this.pixel = pixel;
    }
}
