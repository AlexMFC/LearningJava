
package criandoclasseseobjetos;


public class Caneta {
    //Definindo ATRIBUTOS
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    

    //Definindo METODOS
    public void status(){
        String stat = this.tampada == false ? "Nao":"Sim";
        System.out.println("###########################");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta " +  this.cor);
        System.out.println("Espessura: "+ this.ponta);
        System.out.println("Esta tampada? " +  stat);
        System.out.println("Carga:" + carga);
        System.out.println("###########################");
    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Nao eh possivel escrever com a caneta tampada");
        } else{ 
            System.out.println("Rabiscado de " + this.cor + " com sucesso");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
       
        modelo = m;
    }
    
   public float getPonta(){
        return ponta;
    }
   
   public void setPonta(float p){
       ponta = p;
   }
    
}
