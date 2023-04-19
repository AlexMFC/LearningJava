/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author alexs
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b){
        int s = a+ b;
        System.out.println(s);
    }
    
    static int somar (int a, int b){
        int soma;
        return soma = a+b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        soma(5,2);
        int sm = somar(6,4);
        System.out.println(sm);
    }
    
}
