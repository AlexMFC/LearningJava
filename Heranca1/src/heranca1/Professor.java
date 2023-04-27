/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author alexs
 */
public class Professor extends Person {
    private int studyArea;
    private int salary;

    public int getStudyArea() {
        return studyArea;
    }
    
    public void incSal(){
        System.out.println("Sucesso");
        this.setSalary(this.getSalary() + 500);
    }

    public int getSalary() {
        return salary;
    }

    public void setStudyArea(int studyArea) {
        this.studyArea = studyArea;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
