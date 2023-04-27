/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numnero:");
            n = keyboard.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            resp = keyboard.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores: "+ s);
    }
    
}
