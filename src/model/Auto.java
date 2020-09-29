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
        getVervoerBelasting(gewicht);
    }

    @Override
    public String geefAandrijfKracht(){

        return soortBrandstof;
    }

    @Override
    public String toString() {
        return String.format("%s %s motor.", super.toString(), geefAandrijfKracht());
    }

    @Override
    public void getVervoerBelasting(double belasting) {
        if (getGewicht() < 1000){
            System.out.print(" 85 euro belasting per kwartaal.\n");
        }
        else if (getGewicht() > 1450) {
            System.out.print(" 100 euro belasting per kwartaal.");
        }

    }
}
