package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public abstract class Vervoermiddel {
    private int id;
    private static int aantalVervoermiddelen;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public Vervoermiddel() {
    }

    public String geefAandrijfKracht(){
        return "Test aandrijfkracht";
    }
}
