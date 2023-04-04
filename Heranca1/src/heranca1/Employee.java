/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca1;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Employee extends Person  { 
    private String sector;
    private boolean isWorking;

    public void changeJob(){
        System.out.println("Deseja trocar?");
        this.setIsWorking(false);
        this.setSector(null);
        System.out.println("Digite o trabalho pretendido");
        Scanner keyboard = new Scanner(System.in);
        this.setSector(keyboard.next());
        System.out.println("Seu novo trabalho eh: " + this.getSector() +"\n Deseja confirmar? 1 - Nao / 2- Sim");
        int confirm = keyboard.nextInt();
        if(confirm == 1){
            System.out.println("Nao confirmado");
        } else if (confirm == 2){
            System.out.println("Confirmado");
            this.setIsWorking(true);
        } else{
            throw new Error ("Opcao invalida");
        }
    }
   
    
    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public String getSector() {
        return sector;
    }

    public boolean isIsWorking() {
        return isWorking;
    }
    
    
}
