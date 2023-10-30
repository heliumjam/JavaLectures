package OOP;

public interface Animals {
    public int numberOfLegs (); // 1. add standard method
    public boolean isFlying();

    public default String voice(){
        return "";
    }

}
