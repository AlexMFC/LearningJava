/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
public class Fish extends Animal {
    private String scaleColor;

    @Override
    public void move(){
        System.out.println("Nadando");
    }
    @Override
    public void feed(){
        System.out.println("Comendo algas");
    }
    @Override
    public void makeSound(){
        System.out.println("Fish noises!");
    }
    
    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
    
}
