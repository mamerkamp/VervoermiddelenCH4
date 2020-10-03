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

    final int MAX_LENGTE_VERLAAGD_BELASTING_TARIEF = 12;
    final double LAAG_BELASTING_TARIEF = 60.00;
    final double HOOG_BELASTING_TARIEF = 100.00;

    public double belastingBerekening (double lengteInMeter) {
        if (getLengteInMeter() < MAX_LENGTE_VERLAAGD_BELASTING_TARIEF) {
            return LAAG_BELASTING_TARIEF;
        }
        return HOOG_BELASTING_TARIEF;
    }

    final double DIESEL_BELASTING_TOESLAG = 1.3;
    final int STANDAARD_BELASTING_TOESLAG = 1;

    public double belastingToeslagBerekening(String soortBrandstof){
        if (soortBrandstof.equals("diesel")) {
            return DIESEL_BELASTING_TOESLAG;
        }
        return STANDAARD_BELASTING_TOESLAG;
    }
}
