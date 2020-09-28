package controller;

import model.Auto;
import model.Vervoermiddel;
import model.Zeilboot;

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

        for (Vervoermiddel vervoermiddel : voertuigen) {
            System.out.println(vervoermiddel);
        }


    }

}
