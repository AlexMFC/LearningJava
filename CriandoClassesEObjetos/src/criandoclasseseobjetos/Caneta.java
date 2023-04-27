
package criandoclasseseobjetos;


public class Caneta {
    //Definindo ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    String status = "";
    

    //Definindo METODOS
    void status(){
        String status = this.tampada == false ? "Nao":"Sim";
        System.out.println("###########################");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " +  this.cor);
        System.out.println("Espessura: "+ this.ponta);
        System.out.println("Esta tampada? " +  status);
        System.out.println("###########################");
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Nao eh possivel escrever com a caneta tampada");
        } else{ 
            System.out.println("Rabiscado de " + this.cor + " com sucesso");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
}
