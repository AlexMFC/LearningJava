
package contabancaria;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class ContaBanco {
    public double accNum;
    protected String accType;
    private String accOwn;
    private float accTotal;
    private boolean accStatus;
    private Scanner keyboard = new Scanner(System.in);
      
     
    public void OpenAcc(){
        System.out.println("Qual o tipo de conta? "
                            + "1- Conta corrente (cc)"
                            + "2- Conta poupanca (cp)");
        String type = keyboard.next();
        setAccType(type);
        
        System.out.println("Nome completo: ");
        String owner = keyboard.next();
        setAccOwn(owner);
        
        System.out.println("Aguarde");
        
        setAccNum((Math.random()*(9999-1)+1)); //Define numero da conta aleatoriamente entre 0 e 9999
        
        if("cc".equals(type)){ //Faz verificacao do tipo de conta e adiciona saldo
            setAccTotal(50);
        } else if ("cp".equals(type)){
            setAccTotal(150);
        } else{
            throw new Error("Erro - tipo invalido");
        }
        
        setAccStatus(true);
        TelaSucesso();
        
    }
    
    public void closeAcc(){
        System.out.println("Deseja fechar a conta? S - sim / N - nao");
        String x = keyboard.next();
        if("S".equals(x)){
            if(this.accTotal == 0){
                System.out.println("Conta fechada com sucesso!");
                reset();
            } else if (this.accTotal > 0){
                System.out.println("Nao foi possivel fechar pois ainda ha " + this.accTotal + "reais em conta");
            } else{
                System.out.println("Nao foi possivel fechar - Conta em debito\n "
                        + "Valor do saldo: "  + this.accTotal );
            }
        }else if ("N".equals(x)){
            System.out.println("Operacao Cancelada!");
        } else{
            throw new Error("Opcao invalida");
        }
        
    }
    
    public void deposit(){
        if (this.accStatus == true){
            System.out.println("Digite o montante que deseja depositar:");
            this.accTotal += keyboard.nextFloat();
            System.out.println("Saldo atual: " + this.accTotal);
        } else {
            System.out.println("Erro - conta inativa");
        }
        
    }
    
    public void withdraw(){
        if (this.accStatus == true){
            System.out.println("Saldo atual: " + this.accTotal);
            System.out.println("Quanto deseja sacar?");
            float draw = keyboard.nextFloat();
            float withdraw  = draw > 0 ? draw : 0;
                
            if(this.accTotal < withdraw){
                throw new Error("Saldo insuficiente");
            }else{
                this.accTotal -= withdraw;
            }
            System.out.println("Saldo atualizado: " + this.accTotal);  
        } else{
            System.out.println("Erro - conta inativa");
        }
         
    }
    
    public void mensalityFee(){
        int mensality = 0;
        if("cc".equals(this.accType)){
            mensality = 10;
        } else {
            mensality = 20;
        }
        
        boolean check = this.accTotal >= mensality ? true : false;
        
        if(check == true){
            this.accTotal -= mensality;
            System.out.println("Mensalidade paga!");
        } else{
            System.out.println("Saldo insuficiente - Conta desativada");
            setAccStatus(false);
        }
    }
    
    private void TelaSucesso(){
        String tipo = "cc".equals(this.accType) ? "Conta Corrente":"Conta Poupanca";
        String status = this.accStatus == true ? "Ativa":"Inativa";
        System.out.println("Conta aberta!");
        System.out.println("Proprietario: " + this.accOwn);
        System.out.println("Numero da conta: " + this.accNum);
        System.out.println("Tipo da conta: " + tipo);
        System.out.println("Saldo atual: " + this.accTotal);
        System.out.println("Status: " + status);
    }
    
    public void accInfo(){
        System.out.println("Proprietario: " + this.accOwn);
        System.out.println("Tipo de Conta: " + this.accType);
        System.out.println("Saldo: " + this.accTotal);
    }
    
    
    public double getAccNum(){
        return this.accNum;
    }
    
    private void setAccNum(double number){
        this.accNum = number;
    }
    
    public String getAccType(){
        return this.accType;
    }
    
    private void setAccType(String type){
        this.accType = type;
    }
    
    public String getAccOwn(){
        return this.accOwn;
    }
    
    private void setAccOwn(String owner){
        this.accOwn = owner;
    }
    
    public float getAccTotal(){
        return this.accTotal;
    }
    
    private void setAccTotal(float total){
        this.accTotal = total;
    }
    
    public boolean getAccStatus(){
        return this.accStatus;
    }
    
    private void setAccStatus(boolean stat){
        this.accStatus = stat;
    }
    
    

    private void reset(){
        setAccStatus(false);
        setAccTotal(0);
    }
    
    
}
 
