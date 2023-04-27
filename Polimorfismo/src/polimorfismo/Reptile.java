/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
public class Reptile extends Animal{
    private String scaleColor;

    @Override
    public void move(){
        System.out.println("Rastejando");
    }
    @Override
    public void feed(){
        System.out.println("Comendo folhas");
    }
    @Override
    public void makeSound(){
        System.out.println("Reptile sounds!");
    }
    
    
    
    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
    
}
