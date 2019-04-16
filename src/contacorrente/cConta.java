package contacorrente;

import java.util.Scanner;


public class cConta {
    public int numConta;
    private String tipo;
    private String cliente;
    private float saldo;
    private boolean status;

    public cConta(boolean status, float saldo) {
    this.status = false;
    this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    void abrirConta(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do cliente: ");
        this.cliente = entrada.next();
        System.out.println("Informe o número da conta: ");
        this.numConta = entrada.nextInt();
        System.out.println("Informe o tipo da conta: 'CC' para Conta Corrente ou 'CP' para Conta Poupança");
        this.tipo = entrada.next();
        if("cc".equals(this.getTipo()) || "CC".equals(this.getTipo()) || "cp".equals(this.getTipo()) || "CP".equals(this.getTipo())){
        this.setStatus(true);
        if("CC".equals(this.getTipo()) || "cc".equals(this.getTipo())){
            this.setSaldo(50);
        }
        else if("CP".equals(this.getTipo()) || "cp".equals(this.getTipo())){
            this.setSaldo(150);
        }else{
            System.out.println("Tipo de conta inválida");
            }
        }
        else{
            System.out.println("Opção inválida, reinicie o processo.\n");
        }
        System.out.println("Conta aberta com sucesso.");
         try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
    public void depositar(){
  	if(this.getStatus()==false){
            System.out.println("Conta invalida.");
        }else{
        Scanner entrada = new Scanner(System.in);
        if(this.getStatus()== true){
        System.out.println("Valor do depósito: ");
        float deposito = entrada.nextFloat();              
        this.setSaldo(this.getSaldo()+deposito);
        }else{
            System.out.println("A conta não foi aberta ainda.");
            }
        }
         try { Thread.sleep (1000); } catch (InterruptedException ex) {}
  }
    public void sacar(){
  	if(this.getStatus()==false){
            System.out.println("Conta invalida.");
        }else{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do saque: ");
        float saque = entrada.nextFloat();
        if(this.getStatus()== true && saque<=this.getSaldo()){
        this.setSaldo(this.getSaldo()- saque);
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente.");
            }
        }  
         try { Thread.sleep (1000); } catch (InterruptedException ex) {}
}
     void fecharConta (){
         if(this.getStatus()==false){
            System.out.println("Conta inexistente, para fechar uma conta necessário abrir uma.\n");
        }
         else if(this.getSaldo()==0 && this.getStatus()== true){
            System.out.println("Conta fechada com sucesso.");
            this.setStatus(false);
        }else if(this.getSaldo()>0){
            System.out.println("Para fechar a conta é necessario retirar todo o dinheiro da conta");
        }else if(this.getSaldo()<0){
            System.out.println("Saldo negativo, deposite um valor necessario para zerar a conta");
        }
          try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
     void pagarMens(){
        if(this.getStatus()==false){
            System.out.println("Conta inválida.");
        }else{
        if("CC".equals(this.getTipo()) || "cc".equals(this.getTipo())){
            this.setSaldo(this.getSaldo()- 12);
            System.out.println("Mensalidade paga com sucesso! \n");
        }else if("CP".equals(this.getTipo()) || "cp".equals(this.getTipo())){
            this.setSaldo(this.getSaldo()-25);
            System.out.println("Mensalidade paga com sucesso. \n");
        }
      }
         try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
     
    void exibeConta(){
        if(this.getStatus()==false){
            System.out.println("Conta invalida.");
        }else{
        System.out.println("\tDados da conta: \n");
        System.out.println("\nNúmero da conta: " + this.numConta);
        System.out.println("\nTipo da conta: " +this.tipo);
        System.out.println("\nNome do Cliente: " +this.cliente);
        if(this.getStatus()== true){
            System.out.println("\nStatus da conta: Aberta");
        }else{
            System.out.println("\nStatus da conta: Fechada");
        }
        System.out.println("\nSaldo da conta: "+this.saldo);
        } 
       try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
     void exibeSaldo(){
         System.out.println("O saldo da conta é: "+this.getSaldo());
          try { Thread.sleep (1000); } catch (InterruptedException ex) {}
    }
}