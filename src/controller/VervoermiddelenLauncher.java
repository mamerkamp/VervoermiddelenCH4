package controller;

import model.*;

import java.util.ArrayList;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class VervoermiddelenLauncher {

    public static void main(String[] args) {


        ArrayList<Vervoermiddel> voertuigen = new ArrayList<>();
        voertuigen.add(new Auto("Dacia", "Logan MPV", 4, 1150, "benzine"));
        voertuigen.add(new Zeilboot("Dufour", "36 classic", 11.5));
        voertuigen.add(new Koets("Glinkowski", "marathonwagen", 320, 4));
        voertuigen.add(new Motorboot("Broesder", "kotter", 13.75,"diesel"));
        voertuigen.add(new Auto("Tesla", "P100", 4, 1500, "elektrische"));


        for (Vervoermiddel vervoermiddel : voertuigen) {
            System.out.println(vervoermiddel);
            if (vervoermiddel instanceof Belastbaar) {
                System.out.printf("%.2f euro belasting per kwartaal\n", ((Belastbaar) vervoermiddel).getVervoerBelasting());
            }
        }

    }

}
