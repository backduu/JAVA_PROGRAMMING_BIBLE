package Inheritance;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        D_caPhone dca = new D_caPhone("IN-7600", "010-1234-5648", 60, "400만");
        MP3Phone mp = new MP3Phone("KN-500", "011-545-3545", 50, 256);

        System.out.println(dca.getModel() + ", " + dca.getChord() + ", " + dca.getNumber());

        System.out.println(mp.getModel() + ", " + mp.getChord() + ", " + mp.getNumber());
    }
}
