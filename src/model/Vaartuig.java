package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public abstract class Vaartuig extends Vervoermiddel{

    private int lengteInMeter;

    public Vaartuig(String merk, String type, int lengteInMeter) {
        super(merk, type);
        this.lengteInMeter = lengteInMeter;
    }

    public int getLengteInMeter() {
        return lengteInMeter;
    }

    public void setLengteInMeter(int lengteInMeter) {
        this.lengteInMeter = lengteInMeter;
    }
}
