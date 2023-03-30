
package exerciciopoo;

/**
 *
 * @author alexs
 */
public class ExercicioPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int q = 3;
        Person[] pessoas = new Person[q];
        Books[] livros = new Books[2];
        
        pessoas[0] = new Person("Nome", 18, 'M');
        pessoas[1] = new Person("Ana", 22, 'F');
        pessoas[0] = new Person("Joao", 28, 'M');
        
        livros[0] = new Books("titulo 1", "Autor 1", 99, 0, true, pessoas[0]);
        livros[1] = new Books("titulo 2", "Autor 2", 199, 10, false, pessoas[1]);
        livros[0].details();
        
        Read ler = new Read();
        ler.status(pessoas[0], livros[1]);
        
        livros[1].open();
        livros[1].leafThrough();
    }
    
}
