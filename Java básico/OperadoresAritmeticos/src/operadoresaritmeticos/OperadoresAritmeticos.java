/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author alexs
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        n1 = 3;
        n2 = 5;
        float m = (n1+n2)/2;
        System.out.println(m);
        
        int numero = 5;
        int valor = 5 + numero++; //retorna 10 (o incremento (++) so vai ser lido e executado apos a soma)
        valor = 5 + ++numero; //retorna 11 (o incremento (++) foi executado antes de somar (ordem))
        System.out.println(valor); //resultado = 6
        
        int x = 10;
        x *= x;
        System.out.println(x);
        
        
    }
    
}
