/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

/**
 *
 * @author alexs
 */
public final class Scholar extends Student{
    private int scholarship;
    
    
    public void renewScholarship(){
        System.out.println("renovado");
    }
    
   

    @Override
    public void payMensality() {
        System.out.println("Aluno bolsista-"+  this.getName() + "- Pagamento facilitado");
    }
    
    
    
    public int getScholarship(){
        return this.scholarship;
    }
    
    private void setScholarship(int value){
        this.scholarship = value;
    }
}
