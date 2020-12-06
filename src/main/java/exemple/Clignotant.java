/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author Léa
 */
public class Clignotant extends EffetAnimation {
    
    private Color couleur1;
    private Color couleur2;
    
    public Clignotant(Bandeau bandeau, String message, Color color1, Color color2) {
        super(bandeau);
        setMessage(message);
        this.couleur1 = color1;
        this.couleur2 = color2;
    }
    
    public void dessiner() {
        this.getBandeau().setMessage(this.getMessage());
        for (int i=1; i<10; i++) {
            if (i%2 == 0) {
                this.getBandeau().setForeground(this.couleur1);
                this.getBandeau().setBackground(this.couleur2);
                this.getBandeau().sleep(1000);
            } else {
            this.getBandeau().setForeground(this.couleur2);
            this.getBandeau().setBackground(this.couleur1);
            this.getBandeau().sleep(1000);
            }
        }
        this.getBandeau().sleep(1000);
    }
    
}