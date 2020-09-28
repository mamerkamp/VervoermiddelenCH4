package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Zeilboot extends Vaartuig {

    public Zeilboot(String merk, String type, double lengteInMeter) {
        super(merk, type, lengteInMeter);
        int nieuweID = getId() + 1;
//        int nieuweID = getAantalVervoermiddelen() + 1;
        setId(nieuweID);
    }

    public Zeilboot() {
    }

    public String geefAandrijfKracht(){
        return "windkracht";
    }

}
