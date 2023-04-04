/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author alexs
 */
abstract class Animal {
    private float weight;
    private int age;
    private int members;

    public abstract void move();
    public abstract void feed();
    public abstract void makeSound();
    public void status(){
        move();
        feed();
        makeSound();
    }
    
    
    
    
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getMembers() {
        return members;
    }
    
    
}
