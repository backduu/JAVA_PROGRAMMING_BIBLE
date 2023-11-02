package JAVA_VOCA;

public class InterfaceImplCustomer implements InterfaceExtendsBuySell/*implements InterfaceSell, InterfaceBuy*/{
    @Override
    public void sell() {
        System.out.println("[InterfaceImplCustomer] Customer sell");
    }

    @Override
    public void buy(){
        System.out.println("[InterfaceImplCustomer] Customer buy");
    }

    public void sayHello() {
        System.out.println("hi");
    }

    @Override
    public void order() {
        System.out.println("[InterfaceImplCustomer] customer order");
    }

    @Override
    public void myMethod() {
        System.out.println("[InterfaceImplCustomer] myMethod!");
    }
}
