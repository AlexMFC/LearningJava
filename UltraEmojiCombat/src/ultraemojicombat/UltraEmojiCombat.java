/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultraemojicombat;

/**
 *
 * @author alexs
 */
public class UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[6];
        lutadores[0] = new Lutador("Pretty boy", "France", 31, 1.75, 68.9, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brazil", 29, 1.68, 57.8, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brazil", 37, 1.70, 119.3, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);        
        
        int lut1 = (int) Math.round(Math.random()*5-0+0);
        int lut2 = (int) Math.round(Math.random()*5-0+0);
        
        Fight luta = new Fight();
        luta.scheduleFight(lutadores[lut1],lutadores[lut2]);
        
        
        
        
    }
    
}
