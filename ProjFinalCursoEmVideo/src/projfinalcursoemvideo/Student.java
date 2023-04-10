/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projfinalcursoemvideo;

/**
 *
 * @author alexs
 */
public class Student extends Person{
    private int login;
    private int totalWatched;

    public Student(String name, int age, String sex, int login) {
        super(name, age, sex);
        this.setLogin(login);
        this.setTotalWatched(0);
    }

    public void watchOneMore(){
        this.setTotalWatched(this.getTotalWatched()+1);
    }
    
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotalWatched() {
        return totalWatched;
    }

    public void setTotalWatched(int totalWatched) {
        this.totalWatched = totalWatched;
    }

    @Override
    public String toString() {
        return "Student{"+  super.toString() + "login=" + login + ", totalWatched=" + totalWatched + '}';
    }
    
    
}
