package helpers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PenejemahUang {
    private String s;
    private String[] arrString;
    private Boolean isDotFound=false;
    private Double nilaiUang;
    private String coinSymbol="";
    private Double dollarValue;

    public PenejemahUang(){
        dollarValue=0.0;
    }
    public PenejemahUang(String s){
        dollarValue=0.0;
        this.s = s;
    }
    protected void  generate() {
        Boolean isString=false;

        arrString = s.split("");
        String ss = "";
        for(int i=0; i < arrString.length; i++) {

            if(!arrString[i].equals(".")) {
                try {
                    Double test=Double.parseDouble(arrString[i]);
                    ss+=arrString[i];
                }
                catch (Exception e)
                {
                    coinSymbol+=arrString[i];
                }
            }
            else {
                if(i==0) {
                    ss="0.";
                }
                else{
                    ss+=arrString[i];
                }
                isDotFound=true;
            }
        }
        nilaiUang = Double.parseDouble(ss);
    }
    public Double convertToUang() {
        generate();
        //System.out.println(" nilai uang " + nilaiUang);
        if(coinSymbol.equalsIgnoreCase("q")) {
            return nilaiUang * 0.25;
        }
        else if(coinSymbol.equalsIgnoreCase("d")) {
            return  nilaiUang * 0.10;
        }
        else if(coinSymbol.equalsIgnoreCase("n")){
            return  nilaiUang * 0.05;
        }
        else if(coinSymbol.equalsIgnoreCase("p")) {
            return nilaiUang * 0.01;
        }
        else {
            return 0.0;
        }
    }
}
