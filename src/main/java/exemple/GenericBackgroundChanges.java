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
public class GenericBackgroundChanges extends EffetAnimation {
    
    Color[] listColor = {
        Color.BLUE,
        Color.CYAN,
        Color.RED,
        Color.GREEN,
        Color.MAGENTA,
        Color.ORANGE,
        Color.PINK,
        Color.YELLOW,
        Color.WHITE
    };
    
    public GenericBackgroundChanges(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
    }
    
    public void dessiner() {
        this.getBandeau().setMessage(this.getMessage());
        this.getBandeau().sleep(1000);
        for (int i=0; i<listColor.length; i++) {
            this.getBandeau().setBackground(listColor[i]);
            this.getBandeau().sleep(800);
        }
    }
}
