package model;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Koets extends Voertuig{
    private int aantalPaarden;
    protected final int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, gewicht, aantalPaarden);
        this.aantalPaarden = aantalPaarden;
        int nieuweID = getId() + 1;
        setId(nieuweID);
    }

    public Koets(int aantalPaarden) {
        this.aantalPaarden = aantalPaarden;
    }

    @Override
    public String geefAandrijfKracht(){

        return String.format("%d paarden", aantalPaarden); //TODO paard of paarden maken adhv aantal
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), geefAandrijfKracht());
    }
}
