package OOP;

public class Cats extends Memmals implements Animals{
// 2. auto implement method from interface Animals:
    @Override
    public int numberOfLegs() {

        return 4;
    }


    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public String voice() {
        return Animals.super.voice();
    }

    public double weight = 5;





}
