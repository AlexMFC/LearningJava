/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Reptile reptile = new Reptile();
        Fish fish= new Fish();
        Bird bird = new Bird();
        
        /*mammal.makeSound();
        reptile.makeSound();
        fish.makeSound();
        bird.makeSound ();*/
        
        mammal.setWeight(6.2f);
        mammal.setAge(11);
        mammal.setMembers(4);
        
        mammal.move();
        
        Kangaroo kangaroo = new Kangaroo();
        Dog dog = new Dog();
        Turtle turtle = new Turtle();
        
        kangaroo.setWeight(100);
        kangaroo.setAge(7);
        kangaroo.setMembers(4);
        kangaroo.move();
        kangaroo.usePouch();
        
        dog.setWeight(10);
        dog.setAge(8);
        dog.setMembers(4);
        dog.move();
        System.out.println("###############");
        dog.status();
        System.out.println("###############");
        
        reptile.move();
        turtle.setWeight(10);
        turtle.setAge(8);
        turtle.setMembers(4);
        turtle.move();
        System.out.println("###############");
        turtle.status();
        System.out.println("###############");
        
    }
    
}
