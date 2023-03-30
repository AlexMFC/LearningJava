
package contabancaria;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();
        int opt =0, i = 0;
        
        do{
            System.out.println("Deseja <br> abrir uma conta?");
            System.out.println("1 - abrir conta");
            System.out.println("2 - Fechar conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Checar saldo e infos");
            System.out.println("6 - Pagar Mensalidade");
            System.out.println("0 - sair");
            opt = keyboard.nextInt();
            switch(opt){
                case 1:
                    conta.OpenAcc();
                    break;
                case 2:
                    conta.closeAcc();
                    break;
                case 3:
                    conta.deposit();
                    break;
                case 4:
                    conta.withdraw();
                    break;
                case 5:
                    conta.accInfo();
                    break;
                case 6:
                    conta.mensalityFee();
                default:
                    break;
            }
        }while (opt != 0);  
               
          
    }
    
}
