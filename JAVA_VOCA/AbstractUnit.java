package JAVA_VOCA;

public abstract class AbstractUnit {
    protected String name;
    protected int energy;
    abstract public void decEnergy(); // 추상 메서드는 body가 없다!
    public int getEnergy() {
        return energy;
    }

}
