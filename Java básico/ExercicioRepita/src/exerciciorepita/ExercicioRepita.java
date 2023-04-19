/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author alexs
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, soma =0,total =0, par = 0, impar=0, above=0, media;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog
            ("<html>Insira um numero:<br> (valor 0 interrompe)</html>"));
            soma += num;
            total++;
            if (num %2 ==0) par++;
            else impar++;
            if (num > 100) above++;
            media = soma/total;
            
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null,"<html>Resultado final:" + soma +
                "<br>Total de pares:" + par +
                "<br>Total de impares:" + impar +
                "<br>Acima de 100:" + above +
                "<br>Media dos valores:" + media );      
    } 
}
