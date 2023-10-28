public class testMain {

    public static void test(String text){
        System.out.println(text);
    }
    public static void main(String[] args) {

    test("This method print this text");

// Even or Odd number
        int num = 201;
        int x = num % 2;
        if (x == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // Casting
        int cast = (int) (3.1 +2);
        System.out.println(cast);


        // Switch for days
        int dayNumber = 0;
        switch(dayNumber){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Nothing");

        }

       // Array
       String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (String day : weekDays
             ) {
            System.out.print(day + ", ");
        }
        System.out.println();

    }
}
