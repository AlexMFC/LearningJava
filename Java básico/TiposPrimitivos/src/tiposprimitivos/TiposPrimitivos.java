/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota");
        float nota = teclado.nextFloat();
        System.out.printf("A note de %s eh %.2f \n", nome, nota);
    }
    
}
