package JAVA_VOCA;

import com.sun.tools.javac.Main;
import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.sql.*;
import java.util.*;
import java.text.*;
import java.util.regex.Pattern;


public class main{

    public static void main(String[] args) throws IOException {
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

/*        // 와일드카드
        GenericEx2<Cat> cat = new GenericEx2<>();
        cat.add(new Cat());
        GenericEx2<Dog> dog = new GenericEx2<>();
        dog.add(new Dog());
        GenericEx2.cryingAnimalList(cat);
        GenericEx2.cryingAnimalList(dog);*/

        // Calendar 클래스
/*        Calendar cal=Calendar.getInstance();	//getInstance()로 객체 생성
        System.out.println("현재 날짜:"+cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("일주일 중 오늘은 "+cal.get(Calendar.DAY_OF_WEEK)+"번째 요일 (1은 일요일)");
        System.out.println("일년 중 오늘은 "+cal.get(Calendar.DAY_OF_YEAR)+"번째 날");
        System.out.println("현재 시간 "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND)+":"+cal.get(Calendar.MILLISECOND));
        System.out.println("현재 시간 "+cal.get(Calendar.AM_PM)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
        System.out.println("이번 주는 일년 중 "+cal.get(Calendar.WEEK_OF_YEAR)+"번째 주");*/

/*        Calendar cal=Calendar.getInstance();	//getInstance()로 객체 생성. 기본 현재 날짜
        cal.set(Calendar.MONDAY,Calendar.DECEMBER); 	//12월로 설정
        cal.set(Calendar.HOUR_OF_DAY,14);	//오후 2시로 Calendar 객체 설정
        System.out.println("설정된 날짜 - "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일");
        System.out.println("설정된 시간 - "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));*/

        /*Calendar today=Calendar.getInstance();	//getInstance()로 객체 생성. 기본 현재 날짜
        System.out.println("1970년 00시 00분부터 흐른 초 :"+today.getTimeInMillis()/1000);

        SimpleDateFormat format=new SimpleDateFormat("a hh:mm:ss");
        System.out.println("현재시간 "+format.format(today.getTimeInMillis()));	//SimpleDateFormat으로 출력
        Calendar newYear=Calendar.getInstance();	//현지 시간으로 설정
        newYear.set(Calendar.YEAR, 2021);
        newYear.set(Calendar.MONTH, Calendar.OCTOBER);
        newYear.set(Calendar.DAY_OF_MONTH, 21);

        long diff=newYear.getTimeInMillis()-today.getTimeInMillis();
        Calendar dDay=Calendar.getInstance();
        dDay.setTimeInMillis(diff);	//1년 이내로만 이 코드를 쓸 수 있음
        System.out.println("남은 날 수 :"+(dDay.get(Calendar.DAY_OF_YEAR)-1));	//오늘이 포함되므로 -1

        diff=diff/(60*60*24*1000);	//60(분) * 60(1분) * 24(시간) * 1(초) = 하루
        System.out.println("남은 날 수 :"+diff);*/

/*        Calendar yesterday=Calendar.getInstance();
        yesterday.set(Calendar.DATE, yesterday.get(Calendar.DATE)-1);	//현재 날짜 -1로 설정
        Calendar today=Calendar.getInstance();
        Calendar tomorrow=Calendar.getInstance();
        tomorrow.set(Calendar.DATE, tomorrow.get(Calendar.DATE)+1);	//현재 날짜 +1

        System.out.println("오늘이 어제보다 이전인가? "+today.before(yesterday));
        System.out.println("오늘이 내일보다 이전인가? "+today.before(tomorrow));

        System.out.println("오늘이 어제보다 이후인가? "+today.after(yesterday));
        System.out.println("오늘이 내일보다 이후인가? "+today.after(tomorrow));*/

        // 스레드 join 메소드 사용법 - before
        /*System.out.println("main start");
        Runnable r1 = new MyRunnableOne();
        Thread myThread = new Thread(r1);
        myThread.start();
        System.out.println("main end");*/

        // 스레드 join 메소드 사용법 - after
/*        System.out.println(Thread.currentThread().getName() + " start");
        Runnable r1 = new MyRunnableOne();
        Thread myThread = new Thread(r1);
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " end");
        }*/

        // multi thread 스레드 스케줄러
/*        MyRunnableOne r1 = new MyRunnableOne();
        Thread firstThread = new Thread(r1, "it is the first thread");
        firstThread.start();
        MyRunnableOne r2 = new MyRunnableOne();
        Thread secondThread = new Thread(r2, "it is the second thread");
        secondThread.start();*/

        // 스레드 우선순위
/*        Thread t1 = new SuperThreadPriority("first thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new SuperThreadPriority("second thread");
        t2.start();*/


        // 생산자와 소비자 'wait notify notifyAll 메소드 활용'
/*        ConcurrentClass_Car car = new ConcurrentClass_Car();
        ConcurrentClass_Producer producer = new ConcurrentClass_Producer(car);
        Thread threadOfProducer = new Thread(producer);
        ConcurrentClass_Customer customer = new ConcurrentClass_Customer(car);
        Thread threadOfCustomer = new Thread(customer);
        threadOfCustomer.start();
        threadOfProducer.start();*/

        // 네트워크 - InetAddress 클래스 활용
/*        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println("호스트 이름: " + inetAddress.getHostName());
        System.out.println("호스트 주소: " + inetAddress.getHostAddress());

        inetAddress = InetAddress.getByName("www.naver.com");
        System.out.println("www.naver.com 호스트의 이름: " + inetAddress.getHostName());
        System.out.println("www.naver.com 호스트 주소: " + inetAddress.getHostAddress());

        InetAddress sw[] = InetAddress.getAllByName("www.google.co.uk");
        for(InetAddress addr : sw) {
            System.out.println("영국 구글 호스트 이름 : " + addr.getHostName());
            System.out.println("영국 구글 호스트 주소 : " + addr.getHostAddress());
        }*/

        // 네트워크 - url 클래스 활용
        /*URL url = new URL("http", "java.sum.com", 8880, "index.jsp?name=syh1011#content");
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        int defaultPort = url.getDefaultPort();
        String path = url.getPath();
        String query = url.getQuery();
        String ref = url.getRef();
        String _url = url.toExternalForm();
        String mixUrl = null;
        if(port == -1)
            mixUrl = protocol + "//" + host + path + "?" + query + "#" + ref;
        else
            mixUrl = protocol + "//" + host + ":" + port + path + "?" + query + "#" + ref;

        if(port == -1) port = url.getDefaultPort();

//        System.out.println("protocol: " + protocol);
//        System.out.println("host: " + host + ", port: " + port);
//        System.out.println("path: " + path + ", query: " + query);
//        System.out.println("ref: " + ref + ", mixUrl: " + mixUrl);

        url = new URL("https://www.naver.com");
        InputStream inputStream = url.openStream();
        int readByte;
        System.out.println("문서의 내용 -----------------------------------------------");

        while( ((readByte = inputStream.read()) != -1) ) {
            System.out.printf("%c", (char) readByte);
        }
        inputStream.close();*/

        // 네트워크 - URLConnection 클래스의 활용
        /*URL url = new URL("https://www.naver.com");
        URLConnection con = url.openConnection();
        con.connect();
        Map<String, List<String>> map = con.getHeaderFields();
        Set<String> s = map.keySet();
        Iterator<String> iterator = s.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("name -> " + name + " : ");
            List<String> value = map.get(name);
            for(String _tmp : value)
                System.out.println(_tmp);
        }

        int len = con.getContentLength();
        System.out.println("문서의 길이: " + len + " byte");
        if(len > 0) {
            InputStream input = con.getInputStream();
            int readByte;
            System.out.println("############################################# 문서의 내용 #####################################################");
            while(((readByte = input.read()) != -1) && (--len > 0))
                System.out.printf("%c", (char)readByte);
        } else
            System.out.println("!!! 내용이 없습니다. !!!");*/

        // nio
/*        IntBuffer intBuffer = IntBuffer.allocate(5);
        intBuffer.put(1000);
        intBuffer.put(2000);
        intBuffer.put(3000);
        intBuffer.put(4000);

        intBuffer.flip();
        while(intBuffer.hasRemaining()) {
            System.out.println("첫번째 : " + intBuffer.get());
        }
        System.out.println();
        intBuffer.clear();
        intBuffer.put(4, 5000);
        intBuffer.rewind();
        while(intBuffer.hasRemaining()) {
            System.out.println("두번째 : " + intBuffer.get());
        }*/
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        System.out.println(byteBuffer);
        byteBuffer.putInt(1002);
        System.out.println(">> putInt " +byteBuffer);
        byteBuffer.putDouble(12.444);
        System.out.println(">> putDouble " + byteBuffer);
        byteBuffer.flip();
        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getDouble());

        System.out.println(" ========================================= ");

        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(6);
        System.out.println(byteBuffer1);
        byteBuffer1.putChar('F');
        System.out.println(">> putChar " + byteBuffer1);

        byteBuffer1.putFloat(22.22F);
        System.out.println(">> putFloat " + byteBuffer1);

        byteBuffer1.flip();
        System.out.println(byteBuffer1.getChar());
        System.out.println(byteBuffer1.getFloat());
    }
}
