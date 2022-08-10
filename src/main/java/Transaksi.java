import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaksi {

    public List<Coffee> orderCoffee;
    public Transaksi(){
        orderCoffee = new ArrayList<Coffee>();
    }
    public void addCoffee(Coffee c)
    {
        orderCoffee.add(c);
    }

    public void hitung()
    {
        System.out.println("Daftar transaksi anda");
        System.out.println();
        Double totalHarga=0.0;
        for(Coffee c : orderCoffee) {
            System.out.println(c.getNama() + " " + c.getHarga());
            totalHarga+=c.getHarga();
        }
        System.out.println();
        System.out.println("Total transaksi anda : " + totalHarga);
    }
}
