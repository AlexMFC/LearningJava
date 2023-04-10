/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinalcursoemvideo;

/**
 *
 * @author alexs
 */
public abstract class Person {
    protected String name;
    protected int age;
    protected int exp;
    private String sex;

    public Person(String name, int age, String sex) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setExp(0);
    }
    
    

    protected void earnExp(){
        this.setExp(this.getExp()+1);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", exp=" + exp + ", sex=" + sex + '}';
    }
    
    
}
