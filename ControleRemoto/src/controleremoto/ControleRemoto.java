/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controleremoto;

/**
 *
 * @author alexs
 */
public class ControleRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Control controle = new Control();
        System.out.println(controle.openMenu());
        controle.incVolume();
        System.out.println(controle.openMenu());
        controle.on();
        controle.play();
        controle.incVolume();
        System.out.println(controle.openMenu());
        ;
    }
    
}
