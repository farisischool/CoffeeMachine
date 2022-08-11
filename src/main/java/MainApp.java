import helpers.PenejemahUang;
import sun.applet.Main;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args)
    {
        //(new PenejemahUang("1c5p")).convertToUang();
        HandlePembayaran hp = new HandlePembayaran();
        hp.entriesMany("1q");
        hp.entriesMany("2d");
        hp.entriesMany("1n");
        hp.entriesMany("2p");
        System.out.print("$");
        System.out.format("%.2f",hp.getTotalBayar());
        System.out.println();
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
