package JAVA_VOCA;

public interface InterfaceExtendsBuySell extends InterfaceBuy, InterfaceSell{
    void myMethod();

    @Override
    default void buy() {
        System.out.println("[InterfaceExtendsBuySell] extends buy");
    }

    @Override
    default void sell() {
        System.out.println("[InterfaceExtendsBuySell] extends sell");
    }

    @Override
    default void order() {
        InterfaceBuy.super.order();
    }
}
