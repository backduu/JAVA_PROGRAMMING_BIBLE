package JAVA_VOCA;

public class AbstractProtoss extends AbstractUnit{
    boolean fly;

    public AbstractProtoss(String n, boolean b) {
        name = n;
        energy = 200;
        fly = b;
    }
    @Override
    public void decEnergy() {
        energy--;
    }
}
