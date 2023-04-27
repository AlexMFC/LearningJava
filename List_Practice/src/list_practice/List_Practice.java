
package list_practice;

import entities.Employees;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class List_Practice {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Employees> employees = new ArrayList();
        //ler um numero inteiro N e depois os dados de N funcionarios, sem repeticao de ID
        System.out.println("How many employees will be registered?");
        int N = keyboard.nextInt();
        
        for (int i = 0; i< N; i++){
            keyboard.nextLine();
            System.out.println("Employee #" + (i+1) + "\nType the employee's name:");
            String name = keyboard.nextLine();
            System.out.println("Type the employee's ID:");
            int id = keyboard.nextInt();
            System.out.println("Type the employee's salary:");
            double salary = keyboard.nextDouble();
            for (Employees x : employees){
                if (x.getId() == id){
                    throw new Error ("This ID is already registered");
                } else{
                    continue;
                }
            }
            System.out.println("Registration done!");
            employees.add(new Employees(name, id, salary) );
        }   
        System.out.println("------------------------");
        System.out.println("Employees");
        for (Employees x : employees){
            x.status();
        }
        System.out.println("------------------------");
        
        System.out.println("Increase salary");
        System.out.println("Type the employee's ID:");
        int idInc = keyboard.nextInt();
        Integer pos = position(employees, idInc);
        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.println("How much will the salary increase? (in %)");
            double inc = keyboard.nextDouble();
            employees.get(pos).incSal(inc);
        }
    
        
        
        System.out.println("------------------------");
        System.out.println("Employees");
        for (Employees x : employees){
            x.status();
        }
        
          
            
       
        
        //System.out.println(employees.get(N));
	/*Efetuar o aumento de X por centro no salario de determinado funcionario.
	  Para isso, o programa deve ser um id e o valor X. Se o id informado nao existir, mostrar uma mensageme  abortar a operacao
	  Ao final, mostrar listagem atualizada dos funcionarios
	  
        Aplicar encapsulamento. Salario so pode ser aumentado por operacao de aumento por porcentagem dada*/
	
    }
    
    public static Integer position(List <Employees> list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    
}
