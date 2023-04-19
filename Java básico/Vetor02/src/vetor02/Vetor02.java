/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Arrays;

/**
 *
 * @author alexs
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 6.72, 5.68};
        Arrays.sort(v);
        for (double valor: v){ //especifico para vetores
            System.out.println(valor);
        }
        
        int vet[] = {3,7,1,8,1};
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Valor na posicao "+p);
    }
    
}
