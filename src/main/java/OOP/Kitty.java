package OOP;

public class Kitty extends Cats{
    private int color; //

    private int x;
    private int y;
    private double z;

        {
            color = -1;
        } // check that class initialiazed right, default

    public Kitty(){
    this.color =-2;
    };

    public Kitty(int color){
        this.color = color;
    }

    public Kitty(int x, int y, double z){
        this.x =x;
        this.y = y;
        this.z = z;
    }

    private boolean isValueCorrected(int value, int min, int max){
        return (0 < value && value <100);
    }

    public int getColor() {

        return color;
    }

    public void setColor(int color) {
        int min = 0;
        int max =100;
       if (isValueCorrected(color, min , max)){
        this.color = color;
       }
       else System.out.println("Color  must be higher than 0 and lower than 100");;
    }
}
