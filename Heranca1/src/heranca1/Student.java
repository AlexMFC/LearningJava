/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author alexs
 */
public class Student extends Person {
    public int regNum;
    public String course;
    
    //METODOS ABSTRATOS
    
    public void payMensality(){
        System.out.println("Mensalidade paga!");
    }
    public void unsubscribe(){
        System.out.println("Matricula cancelada");
        this.setCourse(null);
        this.setRegNum(0);
    }

    //METODOS ESPECIAIS
    public void setRegNum(int regNum){
        this.regNum = regNum;
    }
    
    public int getRegNum(){
        return this.regNum;
    }
    
    public void setCourse(String course){
        this.course = course;
    }
    
    public String getCourse(){
        return this.course;
    }
}
