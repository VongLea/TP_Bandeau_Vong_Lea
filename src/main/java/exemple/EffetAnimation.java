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
public abstract class EffetAnimation {
    
    private String message;
    private Bandeau monBandeau;
    public Color color;
    
    public EffetAnimation(Bandeau bandeau) {
        this.monBandeau = bandeau;
    }
    
    public Bandeau getBandeau() {
        return this.monBandeau;
    }
    
    public void setBandeau(Bandeau bandeau) {
        this.monBandeau = bandeau;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract void dessiner();
}
