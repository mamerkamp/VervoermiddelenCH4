package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Zeilboot extends Vaartuig {

    public Zeilboot(String merk, String type, double lengteInMeter) {
        super(merk, type, lengteInMeter);
    }

    public Zeilboot() {
    }

    public String geefAandrijfKracht(){
        return "windkracht";
    }

}
