/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
public class Mammal extends Animal {
   private String furColor;
    
    @Override
    public void move(){
        System.out.println("Correndo");
    }
    
    @Override
    public void feed(){
        System.out.println("Mamando");
    }
    
    @Override
    public void makeSound(){
        System.out.println("Mammal sound!");
    }
   

    
    
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
   
}
