package JAVA_VOCA;

import java.sql.SQLOutput;
import java.util.*;

public class main {

    public static void main(String[] args) {


        // 0(min) -- 2(delete) 4(delete)
        // 1(min) -- 3(delete)

        // mapBufferInfo 반복돌리면서 indexMap에 있는 인덱스들 이미 삭제된 애들 지나가고 전부 삭제한 후에 한개 새로 넣어두고 인덱스 다시 맞춰두자


        // 상속
        /*        D_caPhone dca = new D_caPhone("IN-7600", "010-1234-5648", 60, "400만");
        MP3Phone mp = new MP3Phone("KN-500", "011-545-3545", 50, 256);
        System.out.println(dca.getModel() + ", " + dca.getChord() + ", " + dca.getNumber());
        System.out.println(mp.getModel() + ", " + mp.getChord() + ", " + mp.getNumber());*/

        // 오버라이드
        /*        D_caPhone child = new D_caPhone("IN-7600", "010-1234-5648", 60, "400만");
        System.out.println(child.getMsg());

        Cellphone parent = new D_caPhone("IN-7600", "010-1234-5648", 60, "400만");
        System.out.println(parent.getMsg());*/

      // super()
        /*          D_caPhone child = new D_caPhone("IN-7600", "010-1234-5648", 60, "400만");
        System.out.println(child.getMsg());*/

        // 추상클래스의 상속관계
        AbstractZerg z1 = new AbstractZerg("히드라리스크", false);
        AbstractProtoss p1 = new AbstractProtoss("드라군", false);
        AbstractTerran t1 = new AbstractTerran("배틀크루져", true);
        System.out.println("히드라리스크의 에너지:: " + z1.getEnergy());
        System.out.println("드라군의 에너지:: " + p1.getEnergy());
        System.out.println("배틀크루저의 에너지:: " + t1.getEnergy());

        z1.decEnergy();
        p1.decEnergy();
        t1.decEnergy();
        System.out.println("히드라리스크 is under an attacked!! " + z1.getEnergy());
        System.out.println("드라군 is under an attacked!! " + p1.getEnergy());
        System.out.println("배틀크루저 is under an attacked!! " + t1.getEnergy());
    }
}
