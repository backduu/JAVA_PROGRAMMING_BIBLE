package JAVA_VOCA;

public interface InterfaceBuy {
    void buy();

    default void order() {
        System.out.println("buy order");
    }
}
