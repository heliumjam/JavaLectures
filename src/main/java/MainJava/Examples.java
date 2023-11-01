package MainJava;

import static java.lang.Thread.sleep;

public class Examples {
    public static void main(String[] args) throws InterruptedException {
        delimeter1(3, 0);
        delimeter2(3, 1);
        pause1(100);
        pause2(200);


    }

    public static int delimeter1 (int a, int b){ // todo with try catch
        int res = 0;
        try{
            res = a / b;
            System.out.println("delimeter1 res = " + res);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());

        }
        return res;
    }

    public static int delimeter2 (int a, int b){ // todo with without any exception
        int res = 0;
            res = a / b;
        System.out.println("delimeter1 res = " + res);
        return res;
    }

    public static void pause1(long mill){ //todo with try catch

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pause2(long mill) throws InterruptedException { // todo with throws
        Thread.sleep(5000);
    }
}
