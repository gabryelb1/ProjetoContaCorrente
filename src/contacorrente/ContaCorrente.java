package contacorrente;
import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
      cConta c1 = new cConta(false, 0);
      
      int opc = -1;
        Scanner teclado = new Scanner(System.in);
        while(opc!=0){
            System.out.println("Digite a opção desejada: \n"
                    + "1- Abrir conta\n"
                    + "2- Depósito\n" 
                    + "3- Saque\n"
                    + "4- Exibir dados da conta\n"
                    + "5- Fechar conta\n"
                    + "6- Pagar Mensalidade\n"
                    + "7- Saldo\n"
                    + "0- Finalizar operação\n");
            opc = teclado.nextInt();
        if(opc == 1){
          c1.abrirConta();
      }  
        else if(opc == 2){
          c1.depositar();
      }   
        else if(opc == 3){
          c1.sacar();
      }   
        else if(opc == 4){
         c1.exibeConta();
      }   
        else if(opc == 5){
         c1.fecharConta();
      }   
        else if(opc == 6){
         c1.pagarMens();
        
      } 
        else if(opc == 7){
         c1.exibeSaldo();
        }
        else if(opc == 0){
        System.out.println("Obrigado por utilizar o programa, finalizando sessão. \n.");
      }else{
            System.out.println("Opção informada inválida, digite uma opção válida. \n");
        }
      
    }
    
}
}