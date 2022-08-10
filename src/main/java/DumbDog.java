import java.util.Scanner;

public class DumbDog {

    public void test(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myint = keyboard.nextInt();

        if(myint==0) throw new RuntimeException("tapi jangan 0 lah!");
        System.out.println(" test aja : " + myint);
    }
}
