/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismosobrecarga;

/**
 *
 * @author alexs
 */
public class Dog extends Wolf{
    @Override
    public void emmitSound(){
        System.out.println("Latido!");
    }
    
    public void react(String phrase){
        if("amigavel".equals(phrase)){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void react(int hour, int minutes){
        if (hour<12){
            System.out.println("abanar");
        } else if (hour>12 && hour < 18){
            System.out.println("abanar e latir");
        } else {
            System.out.println("Ignorar");
        }
    }
    
    public void react(boolean owner){
        if (owner == true){
            System.out.println("Latir para o dono");
        } else{
            System.out.println("Rosnar para estranho");
        }
    }
    
    public void react(int age, float weight){
        if(age<5 ){
            if(weight <10){
                System.out.println("abanar");
            } else if(weight < 10 && weight > 5){
                System.out.println("Latir");
            }        
        } else {
           if (weight > 10){
               System.out.println("Ignorando");
           } else{
               System.out.println("Rosnando");
           }
        }
    }
    
}
