package Inheritance;

public class MP3Phone extends Cellphone{
    int size;
    public MP3Phone(String model, String num, int chord, int size) {
        super(2);
        this.model = model;
        number =num;
        this.chord =chord;
        this.size = size;
    }
}
