/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author alexs
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Alex";
        String nome2 = "Alex";
        String nome3 = new String("Alex");
        String res;
        res = (nome1 == nome2)? "Igual":"Diferente";
        res = (nome1.equals (nome3))? "Igual":"Diferente"; //equals compara conteudo
        System.out.println(res);
    }
    
}
