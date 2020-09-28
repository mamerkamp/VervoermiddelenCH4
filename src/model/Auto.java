package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Auto extends Voertuig {

    private String soortBrandstof;
    protected final int AANTAL_WIELEN = 4;

    public Auto(String merk, String type, int aantalWielen, int gewicht, String soortBrandstof) {
        super(merk, type, aantalWielen, gewicht);
        this.soortBrandstof = soortBrandstof;
        int nieuweID = 0;
        nieuweID = getAantalVervoermiddelen() + 1;
        setId(nieuweID);
    }

    public String geefAandrijfKracht(){
        return "Benzine";
    }
}
