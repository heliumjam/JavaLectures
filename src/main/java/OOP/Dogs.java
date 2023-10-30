package OOP;

public class Dogs extends Memmals implements Animals{
    private double weght;


    public double getWeght() {
        return weght;
    }

    public void setWeght(double weght) {
        this.weght = weght;
    }

    public void setWeght(int weght) {
        this.weght = (double) weght;
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public String voice() {
        return "Gav-Gav";
    }
}
