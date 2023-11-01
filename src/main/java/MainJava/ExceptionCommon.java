package MainJava;

public class ExceptionCommon {
/*
java.lang.Object
    java.lang.Throwable
        java.lang.Exception
            java.lang.RuntimeException
                java.lang.NullPointerException
 */
    // main - psvm

    public static void main(String[] args)  {
        try {
            //try this code
            //if code ok -> programm go to finally
            // if something wrong -> go to catch

            System.out.println(9 / 0);
            //System.out.println(9 / 3);

            }catch (NullPointerException e) {
          // if it exseption not Null -> go to next Exception
            // if it's null -> do code from catch and -> go to finally
            System.out.println("======== NullPointerException======== ");

            System.out.println(e.getMessage());  // simple Message
            System.out.println(e.getStackTrace()); // full message


        }catch (ArithmeticException e) {
            // if it's Arithmetic not Null -> go to next Exception
            // if it's Arithmetic -> do code from catch and -> go to finally

            System.out.println("======== ArithmeticException======== ");

            System.out.println(e.getMessage());  // simple Message
            System.out.println(e.getStackTrace()); // full message


        }catch (Exception e) {
            // Main Exception  for all
            System.out.println("======== Main Exception ==========");
            }
        finally {
            // This code will work no matter that
            System.out.println("\n -------finally \n");
        }




        //////////// Min : /////////// But we can't see result !!!!!
        try {
            System.out.println(9 / 0);


        }catch (Exception e) {

            System.out.println("======== Main Exception ==========");
        }



        pause();

        delimetr(5,0);




    }

    public static void pause(){
        try {
            Thread.sleep(500);  // 1/2 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static int delimetr (int i, int b) {
        int res =0;
        try {
            return res;
        }
        catch (Exception e){
            e.getMessage();
        }
        return i /b;
    }
}
