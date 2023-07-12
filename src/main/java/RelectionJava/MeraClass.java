package main.java.RelectionJava;

public class MeraClass {
    private int bhola;
    private String Jam;

    public void ChalNaWala() {
        System.out.println("Bhole ka jaam");
    }

    public MeraClass(int bhole, String chaap) {
        this.bhola = bhole;
        this.Jam = chaap;
    }

    public void setBhola(int bhola) {
        this.bhola = bhola;
    }

    public void setJam(String jam) {
        Jam = jam;
    }
}
