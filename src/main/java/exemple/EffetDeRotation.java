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
public class EffetDeRotation extends EffetAnimation {
    
    public EffetDeRotation(Bandeau bandeau, String message) {
        super(bandeau);
        setMessage(message);
    }
    
    public void dessiner() {
        this.getBandeau().setMessage(this.getMessage());
	for (int i = 0; i <= 100; i++) {
		this.getBandeau().setRotation(2*Math.PI*i / 100);
		this.getBandeau().sleep(50);
	}
    }
    
}
