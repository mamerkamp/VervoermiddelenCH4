package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Auto extends Voertuig implements Belastbaar{

    private String soortBrandstof;
    protected final int AANTAL_WIELEN = 4;

    public Auto(String merk, String type, int aantalWielen, int gewicht, String soortBrandstof) {
        super(merk, type, aantalWielen, gewicht);
        this.soortBrandstof = soortBrandstof;
        getVervoerBelasting();
    }

    @Override
    public String geefAandrijfKracht(){

        return soortBrandstof;
    }

    @Override
    public String toString() {
        return String.format("%s %smotor", super.toString(), geefAandrijfKracht());
    }

    @Override
    public double getVervoerBelasting() {
        return belastingBerekening(super.getGewicht()) * belastingToeslagBerekening(soortBrandstof);
    }

    public double belastingBerekening (int gewicht) {
        if (gewicht < 1000) { //TODO FINAL maken van de gewichten en tarieven..
            return 85.00;
        } else if (gewicht >= 1450) {
            return 122.00;
        }
        return 104.00;
    }

    public double belastingToeslagBerekening(String soortBrandstof){
        if (soortBrandstof.equals("diesel")) {
            return 1.3;
        } else if (soortBrandstof.equals("elektrische")) {
            return 0.5;
        }
        return 1;
    }
}
