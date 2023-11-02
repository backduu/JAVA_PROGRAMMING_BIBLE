package JAVA_VOCA;

public class InnerLocal {
    int a = 100;

    public void innerTest(int k) {
        int b = 200;
        final int c = k;

        class InnerLocal2 {
            public void getInnerData() {
                System.out.println("int a : " + a);

                // local 내부 클래스는 지역변수와 상수 모두 사용 가능
                System.out.println("int b : " + b);
                System.out.println("final int c : " + c);
            }
        }

        InnerLocal2 i = new InnerLocal2(); // 메서드 내에서 local 내부 클래스 생성
        i.getInnerData();
    }
}
