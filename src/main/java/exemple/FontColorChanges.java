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
public class FontColorChanges extends EffetAnimation {
    
    public FontColorChanges(Bandeau bandeau, String message, Color color) {
        super(bandeau);
        setMessage(message);
        setColor(color);
    }
    
    public void dessiner() {
        this.getBandeau().setMessage(this.getMessage());
	this.getBandeau().sleep(1000);
	this.getBandeau().setForeground(this.getColor());
        this.getBandeau().sleep(1000);
    }
}
