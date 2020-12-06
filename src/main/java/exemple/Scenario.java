/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.util.*;

/**
 *
 * @author Léa
 */
public class Scenario {
    
    private ArrayList<EffetAnimation> listeEffet = new ArrayList<EffetAnimation>();
    
    public void ajouterEffet(EffetAnimation effet, int nbRepeat) {
        for (int i=0; i<nbRepeat; i++) {
            this.listeEffet.add(effet);
        }   
    }
    
    public void deroulement() {
        for (EffetAnimation e : listeEffet) {
            e.dessiner();
        }
        
    }
    
    public static void main(String[] args) {
        
        Bandeau monBandeau = new Bandeau();
        Scenario scene = new Scenario();
        
        String newLine = System.getProperty("line.separator");
        
        Clignotant clignoteCyanRouge = new Clignotant(monBandeau, "Je change de couleur", Color.CYAN, Color.RED);
        TextApparition text = new TextApparition(monBandeau, "Je fais apparaître un message 2 fois");
        EffetDeRotation rotation = new EffetDeRotation(monBandeau, "Je fais tourner mon texte");
        GenericBackgroundChanges fondMulticolor = new GenericBackgroundChanges(monBandeau, "Je change le fond en plusieurs couleurs");
        FontColorChanges couleurDeTexteBleu = new FontColorChanges(monBandeau, "Mon texte devient bleu", Color.BLUE);
        BackgroundColorChanges couleurDeFondRose = new BackgroundColorChanges(monBandeau, "Je mets le fond en rose", Color.PINK);
        
        
        scene.ajouterEffet(clignoteCyanRouge, 1);
        scene.ajouterEffet(text, 2);
        scene.ajouterEffet(rotation, 3);
        scene.ajouterEffet(fondMulticolor, 1);
        scene.ajouterEffet(couleurDeTexteBleu, 1);
        scene.ajouterEffet(couleurDeFondRose, 1);
       
        scene.deroulement();
        monBandeau.close();
        
    }
}
