/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author alexs
 */
public abstract class Person {
    private String name;
    private int age;
    private String sex;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", sex=" + sex + '}';
    }
    
    
    //Construtor
    public Person(){
        this.age = 0;
        this.name = null;
        this.sex = null;
    }


    //METODOS ABSTRATOS
    public final void doAnniversary(){
        System.out.println("Parabens!!");
        this.setAge(this.getAge() + 1);
    }
    
    
    
    
    //METODOS ESPECIAIS
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public String getSex(){
        return this.sex;
    }
}
