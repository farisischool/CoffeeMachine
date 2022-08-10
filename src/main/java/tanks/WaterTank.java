package tanks;

public class WaterTank implements Tank{

    private  Integer volume;

    public void fill(Integer i) {
        volume = i;
    }

    public void giveResource(Integer i){
        volume -= i;
    }

    public Integer getVolume() {
        return volume;
    }
}
