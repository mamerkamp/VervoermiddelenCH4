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
        int nieuweID = getId() + 1;
//        int nieuweID = getAantalVervoermiddelen() + 1;
        setId(nieuweID);
    }

    @Override
    public String geefAandrijfKracht(){

        return soortBrandstof;
    }
}
