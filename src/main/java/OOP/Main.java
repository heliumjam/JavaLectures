package OOP;

public class Main {
    public static void main(String[] args) {
        Cats jim; // Create object with null
        jim = new Cats(); // Inicialise - create object by tempale of class

        Cats tommy = new Cats(); // create new object from class Cats

        tommy.bodyTemperature = 1.2; // Assigne parameter
        System.out.println("Tommy's body temp = "+tommy.bodyTemperature);
        System.out.println("Tommy's legs = "+tommy.numberOfLegs());


        System.out.println("============================");
Kitty kasper = new Kitty(); //default constructor
        System.out.println("kasper color number is "+ kasper.getColor());
//kasper.color = 200;
        kasper.setColor(200);
        System.out.println("kasper color number is "+ kasper.getColor());

        kasper.weight = 2.2;

        Kitty kitkat = new Kitty(50); //custom constructor
        System.out.println("kitkat color number is "+ kitkat.getColor());




        Point point01 = new Point(57,214,10);
        Point point02 = new Point(167,2,10);
        System.out.println("X on point01 : " + point01.getX());
        System.out.printf("%s", point02.getY());
        System.out.println("\n =================" );


        Dogs gera = new Dogs();
        System.out.println(("Gera weight = " + gera.getWeght()));

        gera.setWeght(25.5);
        System.out.println(("Gera weight = " + gera.getWeght()));
        gera.setWeght(26);
        System.out.println(("Gera weight = " + gera.getWeght()));
        gera.setWeght('s');
        System.out.println(("Gera weight = " + gera.getWeght()));


    }
}

class Point{
    private int x,y;
    private int color;

    public Point(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}