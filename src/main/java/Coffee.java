public class Coffee {
    private String name;
    private Double harga;
    private Integer jumlahMilk;
    private Integer jumlahWater;
    private Integer jumlahKopi;

    public Coffee(){}

    public Coffee(String name, Double harga){
        this.name=name;
        this.harga = harga;
    }

    public void setHarga(Double harga)
    {
        this.harga = harga;
    }

    public Double getHarga(){
        return harga;
    }

    public String getNama(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJumlahMilk() {
        return jumlahMilk;
    }

    public void setJumlahMilk(Integer jumlahMilk) {
        this.jumlahMilk = jumlahMilk;
    }

    public Integer getJumlahWater() {
        return jumlahWater;
    }

    public void setJumlahWater(Integer jumlahWater) {
        this.jumlahWater = jumlahWater;
    }

    public Integer getJumlahKopi() {
        return jumlahKopi;
    }

    public void setJumlahKopi(Integer jumlahKopi) {
        this.jumlahKopi = jumlahKopi;
    }
}
