package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Motorboot extends Vaartuig implements Belastbaar{
    private String soortBrandstof;

    public Motorboot(String merk, String type, double lengteInMeter, String soortBrandstof) {
        super(merk, type, lengteInMeter);
        this.soortBrandstof = soortBrandstof;
        getVervoerBelasting();
    }

    @Override
    public String toString() {
        return String.format("%s %smotor", super.toString(), geefAandrijfKracht());
    }

    @Override
    public String geefAandrijfKracht() {
        return soortBrandstof;
    }

    @Override
    public double getVervoerBelasting() {
        return belastingBerekening(super.getLengteInMeter()) * belastingToeslagBerekening(soortBrandstof);
    }

    public double belastingBerekening (double lengteInMeter) {
        if (getLengteInMeter() < 12) { //TODO FINAL maken van de gewichten en tarieven..
            return 60.00;
        }
        return 100.00;
    }

    public double belastingToeslagBerekening(String soortBrandstof){
        if (soortBrandstof.equals("diesel")) {
            return 1.3;
        }
        return 1;
    }
}
