/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismosobrecarga;

/**
 *
 * @author alexs
 */
public class PolimorfismoSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Wolf wolf = new Wolf();
        Dog dog = new Dog();
        
        mammal.emmitSound();
        wolf.emmitSound();
        dog.emmitSound();
        
        dog.react("amigavel");
        dog.react("agressiva");
        
        dog.react(true);
        dog.react(false);
        
        dog.react(11, 00);
        dog.react(21,00);
        
        dog.react(4, 10.5f);
        dog.react(7, 8.5f);
        dog.react(4, 8.5f);
        dog.react(7, 10.5f);
        
        
    }
    
}
