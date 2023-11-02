package JAVA_VOCA;

public class AbstractZerg extends AbstractUnit{
    boolean fly;
    public AbstractZerg(String n, boolean b) {
        name = n;
        fly = b;
        energy = 100;
    }
    @Override
    public void decEnergy() {
        energy -= 10;
    }
}
