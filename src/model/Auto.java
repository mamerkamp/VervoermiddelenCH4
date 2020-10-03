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

    final int GEWICHT_LAAG = 1000;
    final int GEWICHT_HOOG = 1450;
    final double LAAG_TARIEF = 85.00;
    final double MIDDEN_TARIEF = 104.00;
    final double HOOG_TARIEF = 122.00;

    public double belastingBerekening (int gewicht) {
        if (gewicht < GEWICHT_LAAG) {
            return LAAG_TARIEF;
        } else if (gewicht >= GEWICHT_HOOG) {
            return HOOG_TARIEF;
        }
        return MIDDEN_TARIEF;
    }

    final double DIESEL_BELASTING_VERHOGER = 1.3;
    final double ELEKTRISCH_BELASTING_VERLAGER = 0.5;
    final double STANDAARD_BELASTING = 1;

    public double belastingToeslagBerekening(String soortBrandstof){
        if (soortBrandstof.equals("diesel")) {
            return DIESEL_BELASTING_VERHOGER;
        } else if (soortBrandstof.equals("elektrische")) {
            return ELEKTRISCH_BELASTING_VERLAGER;
        }
        return STANDAARD_BELASTING;
    }
}
