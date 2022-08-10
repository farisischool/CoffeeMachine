import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {

    static String  me;
    static String you;
    private List<String> opsi_list;
    private List<Coffee> coffes;
    private Scanner sc;
    private Transaksi trans;
    private Boolean isRunning=true;
    private Integer iBeli;
    private String sTambah;
    private Integer totalOption;
    private Integer jumlahAir, jumlahKopi, jumlahSusu;


    public CoffeeMachine() {

        Coffee capuccion = new Coffee("Cappuccion", 3.05);
        capuccion.setJumlahMilk(50);
        capuccion.setJumlahKopi(76);
        capuccion.setJumlahWater(100);

        Coffee latte = new Coffee("Latte", 2.05);
        Coffee americano = new Coffee("Americano", 1.00);
        Coffee expresso = new Coffee("Expresso", 1.8);

        coffes = new ArrayList<Coffee>();
        trans = new Transaksi();

        addCoffe(capuccion);
        addCoffe(latte);
        addCoffe(americano);
        addCoffe(expresso);
        sc = new Scanner(System.in);

        jumlahAir=500;
        jumlahKopi=500;
        jumlahSusu=500;
    }

    public void app()
    {
        Boolean startApp=true;
        Boolean iscontinue;

        while(startApp) {
            startApplication();
            iBeli = terimaInputUser(sc);


            if(iBeli == coffes.size()) {
                System.out.println("terima kasih!");
                iscontinue=false;
                startApp=false;
            }

            else if(iBeli <= coffes.size()) {
                System.out.println();
                Coffee c = getCoffee(iBeli);
                trans.addCoffee(c);
                iscontinue=true;

                while(iscontinue)
                {
                    System.out.print("Apakah anda ingin memesan lainnya? (y/n) : ");

                    sTambah = sc.next();

                    if(sTambah.equals("y")){
                        iscontinue=true;
                    }
                    else if(sTambah.equals("n")){
                        trans.hitung();
                        iscontinue=false;
                        startApp=false;
                    }
                    else {
                        System.out.println("Maaf, silahkan coba kembali (y/n)...");
                        iscontinue=false;
                    }
                    iscontinue=false;
                }
            }
            else {
                System.out.println("Maaf, silahkan coba kembali (y/n)...");
                iscontinue=false;
            }
        }
    }


    public void startApplication()
    {
        for(int index = 0; index < coffes.size(); index++) {
            Integer nomor = index + 1;
            messageNewLine(nomor + ". " + coffes.get(index).getNama());
        }
        Integer test = coffes.size() + 1;
        System.out.println(test  + ". Keluar");
    }


    public Integer terimaInputUser(Scanner sc) {
        requestString("Silahkan pilih Kopi yang ingin anda pilih : ");
        Integer number = sc.nextInt();
        return number - 1;
    }

    public void requestString(String arg){
        System.out.print(arg);
    }

    public void messageNewLine(String arg){
        System.out.println(arg);
    }

    public void addCoffe(Coffee coffee) {
        coffes.add(coffee);
    }

    public Coffee getCoffee(Integer i){
        return coffes.get(i);
    }
}
