
package metodosespeciais;

public class Caneta {
    private String marca;
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    private int carga;

    public Caneta(){ //metodo construtor sempre tem o mesmo nome da classe
        defineCaneta("BIC", "Colorida", 0.8f, "Roxo", false, 99);
        //pode se passar parametros ou nao
    }
    
    private void defineCaneta(String m, String mod, float p, String c, boolean t, int q){
        /*this.tampada = true;
        this.carga = 100;
        this.modelo = "Crystal";
        this.marca = "BIC";
        this.cor = "Azul";
        this.ponta = 0.7f; Passando parametros diretamente*/
        
        this.setMarca(m);
        this.setModelo(mod);
        this.setPonta(p);
        this.setCor(c);
        this.setTampada(t);
        this.setCarga(q); //Pegando parametros passados
    }
    
    public void status() {
        String testeTamp = tampada == true ? "Sim":"Nao";
        System.out.println("#########################");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada?: " + testeTamp);
        System.out.println("#########################"); 
        
    }   
    
    public void escrever(){
        if (tampada ==true){
            System.out.println("Impossivel escrever, caneta tampada");
        } else {
            System.out.println("Rabiscado de " + this.getCor() + " com sucesso");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }    
}
