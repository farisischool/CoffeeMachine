import helpers.PenejemahUang;
import sun.applet.Main;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args)
    {
        (new PenejemahUang("15.00p")).convertToUang();
        //(new  MainApp()).runSecondMachine();
    }

    public void runFirstMachine()
    {
        CoffeeMachine cm = new CoffeeMachine();
        try {
            cm.app();
        }
        catch (Exception e) {
            System.out.println(" Inputan anda salah !");
            cm = new CoffeeMachine();
            cm.app();
        }
    }

    public void runSecondMachine()
    {
        CoffeeMachineCopy cm = new CoffeeMachineCopy();
        while (cm.getIsRunning())
        {
            cm.app();
        }
    }
}
