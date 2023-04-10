/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismosobrecarga;

/**
 *
 * @author alexs
 */
public class Mammal extends Animal{
    protected String furColor;
    
    @Override
    public void emmitSound(){
        System.out.println("Som de mamifero");
    }
}
