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
        this.id = ++aantalVervoermiddelen;
       // this.id = aantalVervoermiddelen++;

    }

    public Vervoermiddel() {
    }

    public String geefAandrijfKracht(){
        return "Test aandrijfkracht";
    }

    @Override
    public String toString() {
        return String.format("Vervoermiddel #%d",getId());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = aantalVervoermiddelen;
    }

    public static int getAantalVervoermiddelen() {
        return aantalVervoermiddelen;
    }

    public static void setAantalVervoermiddelen(int aantalVervoermiddelen) {
        Vervoermiddel.aantalVervoermiddelen = aantalVervoermiddelen;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
