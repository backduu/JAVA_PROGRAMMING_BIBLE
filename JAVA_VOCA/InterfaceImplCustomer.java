package JAVA_VOCA;

public class InterfaceImplCustomer implements InterfaceSell, InterfaceBuy{
    @Override
    public void Sell() {
        System.out.println("Customer sell");
    }

    @Override
    public void Buy(){
        System.out.println("Customer buy");
    }

    public void sayHello() {
        System.out.println("hi");
    }
}
