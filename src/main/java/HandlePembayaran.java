import helpers.PenejemahUang;

public class HandlePembayaran {
    private Double uang;
    PenejemahUang penejemahUang;

    public HandlePembayaran() {
        uang=0.0;
    }

    public void entriesMany(String s) {
        try {
            penejemahUang = new PenejemahUang(s);
            uang += penejemahUang.convertToUang();
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    public Double getTotalBayar() {
        return uang;
    }
}
