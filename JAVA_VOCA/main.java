package JAVA_VOCA;

import com.sun.tools.javac.Main;

import java.sql.SQLOutput;
import java.util.*;


public class main{
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
/*        AbstractZerg z1 = new AbstractZerg("히드라리스크", false);
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
        System.out.println("배틀크루저 is under an attacked!! " + t1.getEnergy());*/

/*        // 인터페이스
        InterfaceImplCustomer customer = new InterfaceImplCustomer();
        customer.buy();
        customer.sell();
        customer.sayHello();
        InterfaceBuy buyer = customer;
        buyer.buy();
        InterfaceSell seller = customer;
        seller.sell();
        System.out.println("디폴트 메서드 중복");
        // 인터페이스 디폴트 메서드가 중복되는 경우
        buyer.order();
        seller.order();
        customer.order();
        System.out.println("인터페이스 상속");
        InterfaceImplCustomer myClass = new InterfaceImplCustomer();
        InterfaceBuy buyImpl = myClass;
        InterfaceSell sellImpl = myClass;
        buyImpl.order();
        sellImpl.order();
        myClass.myMethod();
        myClass.sell();
        myClass.buy();*/

/*        // 열거형
        EnumEx enumItem = EnumEx.Search;
        if(enumItem instanceof Object) {
            System.out.println(enumItem.toString() + " :)");
            System.out.println("It's instance of Object");
            System.out.println("value: " + enumItem.ordinal());
        }

        EnumEx[] items = EnumEx.values();
        System.out.println("Length of EnumEx: " + items.length);
        System.out.println("기본 생성자 호출한 enum 객체를 불러오자.");
        for(EnumEx elem : EnumEx.values()) {
            System.out.println("Enum Object: " + elem + " || value: " + elem.ordinal());
        }
        System.out.println("생성자 호출한 enum 객체를 불러오자.");
        for(EnumEx elem : EnumEx.values()) {
            System.out.println("Enum Object: " + elem + " || value: " + elem.getVar());
        }*/

      /*  // 내부클래스
        // Member 내부클래스
        System.out.println("Member 내부 클래스");
        InnerMember outer = new InnerMember();
        InnerMember.Inner inner = outer.new Inner();
        InnerMember.Inner inner2 = new InnerMember().new Inner(); // 내부 클래스의 객체 생성.

        inner.printInnerClassData();
        inner2.printInnerClassData();

        // Local 내부 클래스
        System.out.println("Local 내부 클래스");
        InnerLocal outerLocal = new InnerLocal();
        outerLocal.innerTest(100000);
        System.out.println("Static 내부 클래스");
        // static 내부 클래스
        InnerStatic.InnerStatic2 innerStatic = new InnerStatic.InnerStatic2();
        innerStatic.printInnerStaticData();

        // InnerStic이라는 외부 클래스 내에서 생성할때
        // InnerStatic2 inner = new InnerStatic2();
        // inner.printInnerStaticData();

        // Anonymous 내부 클래스
        System.out.println("Anonymous 내부 클래스");
        InnerAnonymous ai = new InnerAnonymous();
        ai.test();
        InnerAnonymous_2 ai2 = new InnerAnonymous_2();
        ai2.inn.printInnerAnonymouseData();*/

/*        // 제네릭
        GenericEx1<String> t1 = new GenericEx1<>();
        String[] strArr = {"sdfs","wi","ab"};
        t1.set(strArr);
        t1.print();*/

        // 제네릭 사용법과 와일드카드
                /*Generic01<String> generic01 = new Generic01<>();

        generic01.add("item1");
        generic01.add("item2");
        generic01.show();

        Generic01<Integer> generic02 = new Generic01<>();
        generic02.add(43);
        generic02.add(5425);
        generic02.show();*/

        // 와일드카드
        GenericEx2<Cat> cat = new GenericEx2<>();
        cat.add(new Cat());
        GenericEx2<Dog> dog = new GenericEx2<>();
        dog.add(new Dog());
        GenericEx2.cryingAnimalList(cat);
        GenericEx2.cryingAnimalList(dog);
    }
}