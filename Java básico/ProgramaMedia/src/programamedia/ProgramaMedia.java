/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float nasc, year, age;
        
        System.out.println("Ano de nascimento:");
        nasc = keyboard.nextFloat();
        year = 2023;
        
        age = 2023-nasc;
        if (age >= 18 && age < 65){
            System.out.println("Maior!");
        } else if (age > 65) {
            System.out.println("Idoso!");
        } else {
            System.out.println("Menor!");
        }
        
    }
    
}
