/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Léa
 */
public class TextApparition extends EffetAnimation {
    
    public TextApparition(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
    }
    
    public void dessiner() {
        String s = "";
        for (int i=0; i<this.getMessage().length(); i++) {
            s += this.getMessage().substring(i,i+1);
            this.getBandeau().setMessage(s);
            this.getBandeau().sleep(100);
        }
        this.getBandeau().sleep(1000);
        
    }
}
