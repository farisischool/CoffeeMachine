package helpers;

public class PenejemahUang {
    private String s;
    private String[] arrString;
    private Boolean isDotFound=false;

    public PenejemahUang(){

    }
    public PenejemahUang(String s){
        this.s = s;
    }
    protected void  generate() {
        Boolean isString=false;

        arrString = s.split("");
        String ss = "";
        for(int i=0; i < arrString.length; i++) {

            if(!arrString.equals(".")) {
                try {

                }
                catch (Exception e)
                {

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
    }
    public Double convertToUang() {
        generate();
        return 0.0;
    }
}
