package JAVA_VOCA;

public class AbstractTerran extends AbstractUnit{
    boolean fly;
    public AbstractTerran(String n, boolean b) {
        name = n;
        energy = 150;
        fly = b;
    }
    @Override
    public void decEnergy() {
        energy -= 3;
    }
}
