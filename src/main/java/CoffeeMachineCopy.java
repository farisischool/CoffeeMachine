import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class CoffeeMachineCopy {

    private boolean isRunning;
    private boolean isContiue;
    private String sInputPilihanMinuman;
    private Scanner sc;
    private String currentInput;
    Coffee capuccino, latte, expresso;
    private Integer coffeeAmount, milkAmount, waterAmount;
    private Double cashBack;
    private String sDispenser;

    public CoffeeMachineCopy()
    {
        coffeeAmount = 500;
        milkAmount = 500;
        waterAmount = 500;
        cashBack = 100.00;

        isRunning=true;
        sc = new Scanner(System.in);

        capuccino = new Coffee("Cappuccino", 3.05);
        capuccino.setJumlahMilk(50);
        capuccino.setJumlahKopi(76);
        capuccino.setJumlahWater(100);

        latte = new Coffee("Latte", 2.05);
        latte.setJumlahMilk(70);
        latte.setJumlahKopi(76);
        latte.setJumlahWater(100);

        expresso = new Coffee("Espresso", 1.8);
        expresso.setJumlahMilk(0);
        expresso.setJumlahKopi(76);
        expresso.setJumlahWater(100);

        Coffee americano = new Coffee("Americano", 1.00);
    }

    public void provideItem(Coffee coffee)
    {

    }

    public String dispenser(Coffee coffee)
    {

        if(coffee.getJumlahKopi() > coffeeAmount) {
            return coffee.getNama() + " requires " + coffee.getJumlahKopi() + "g coffee but there is only  " + coffeeAmount + "g coffee left in the machine!";
        }
        else if(coffee.getJumlahMilk() > milkAmount) {
            return coffee.getNama() + " requires " + coffee.getJumlahMilk() + "ml milk but there is only " + milkAmount + "ml milk left in the machine!";
        }
        else if(coffee.getJumlahWater() > waterAmount) {
            return coffee.getNama() + " requires " + coffee.getJumlahWater() + "ml water but there is only " + waterAmount + "ml water left in the machine!";
        }
        else {

            coffeeAmount -= coffee.getJumlahKopi();
            milkAmount -= coffee.getJumlahMilk();
            waterAmount -= coffee.getJumlahWater();

            return " dispenser " + coffee.getNama();
        }
    }

    public void app()
    {

        while (isRunning)
        {
            System.out.println("What would you like? (espresso/latte/cappuccino) : ");
            sInputPilihanMinuman = sc.nextLine();

            if(sInputPilihanMinuman.equals("off")) {
                isRunning=false;
            }
            else {
                if(sInputPilihanMinuman.equalsIgnoreCase(expresso.getNama())) {
                    sDispenser = dispenser(expresso);
                    currentInput=sInputPilihanMinuman;
                }
                else if(sInputPilihanMinuman.equalsIgnoreCase(latte.getNama())) {
                    sDispenser = dispenser(latte);
                    currentInput=sInputPilihanMinuman;
                }
                else if(sInputPilihanMinuman.equalsIgnoreCase(capuccino.getNama())) {
                    sDispenser = dispenser(capuccino);
                    currentInput=sInputPilihanMinuman;
                }
                else if(sInputPilihanMinuman.equalsIgnoreCase("report")) {
                    printReport(currentInput);
                    sDispenser="";
                }
                else {
                    sDispenser = "The drink you selected was not found!";
                }
                displayMessage(sDispenser);
            }
        }
    }

    public void displayMessage(String message)
    {
        System.out.println(message);
    }

    public Boolean getIsRunning()
    {
        return isRunning;
    }

    public void printReport(String input){
        generateComposition(input);
    }

    public void generateComposition(String input)
    {
        System.out.println(input);
        if(input.equalsIgnoreCase(expresso.getNama())) {
            System.out.println("Water : " + expresso.getJumlahWater() + "ml");
            System.out.println("Coffee : " + expresso.getJumlahKopi() + "g");
            System.out.println("Money :  $" + expresso.getHarga()  );
        }
        else if(input.equalsIgnoreCase(latte.getNama())) {
            System.out.println("Water : " + 100 + "ml");
            System.out.println(" Water : " + 70 + "ml");
            System.out.println("Coffee : " + 76 + "g");
            System.out.println("Money :  $" + 2.5  );
        }
        else if(input.equalsIgnoreCase(capuccino.getNama())) {
            System.out.println("Water : " + 100 + "ml");
            System.out.println(" Water : " + 50 + "ml");
            System.out.println("Coffee : " + 76 + "g");
            System.out.println("Money :  $" + 3.5  );
        }
        else {
            System.out.println("There is no transaction yet");
        }
    }
}
