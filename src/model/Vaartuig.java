package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public abstract class Vaartuig extends Vervoermiddel{

    private double lengteInMeter;

    protected Vaartuig(String merk, String type, double lengteInMeter) {
        super(merk, type);
        this.lengteInMeter = lengteInMeter;

    }

    protected Vaartuig() {

    }

    public String toString(){
        return String.format("%s %s %s aangedreven door %s", super.toString(), getMerk(), getType(), geefAandrijfKracht());
    }

    public double getLengteInMeter() {
        return lengteInMeter;
    }

    public void setLengteInMeter(double lengteInMeter) {
        this.lengteInMeter = lengteInMeter;
    }
}
