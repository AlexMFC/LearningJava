/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopoo;

/**
 *
 * @author alexs
 */
public class Person  {
    private  String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
    }
    
    

    //Metodos abstratos
    public void birthday(){
        System.out.println("Parabens pelo seu aniversario");
        this.setAge(this.getAge()+1);
    }
    
    
    
    //Metodos especiais
    private void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    private void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }
    
    private void setSex(char sex){
        this.sex = sex;
    }
    
    public char getSex(){
        return this.sex;
    }
}
