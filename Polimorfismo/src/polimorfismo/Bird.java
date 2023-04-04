/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
public class Bird extends Animal{
    private int featherColor;

     @Override
    public void move(){
         System.out.println("Voando ");
    }
    @Override
    public void feed(){
        System.out.println("Comendo alpiste");
    }
    @Override
    public void makeSound(){
        System.out.println("Bird noises!");
    }
    
    
    public void doNest(){
        System.out.println("Construindo ninho");
    }
    
    public int getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(int featherColor) {
        this.featherColor = featherColor;
    }
    
    
}
