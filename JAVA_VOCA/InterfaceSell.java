package JAVA_VOCA;

public interface InterfaceSell {
    void sell();

    default void order() {
        System.out.println("Sell Order");
    }
}
