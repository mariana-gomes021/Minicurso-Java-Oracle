import java.util.Scanner;

public class Controle{
  public static void main (String[] args){;
    Scanner entrada = new Scanner(System.in);
    int resp;
    String nome;
    int idade;
    
    resp = 1;
    
    while(resp ==1){
       System.out.println("Digite o seu nome: ");
       nome = entrada.next();
       System.out.println("Digite a sua idade: ");
       idade = entrada.nextInt();
       
       if(idade >= 1){
          System.out.println("Seu nome é: " + nome);
       }
        System.out.println("Deseja continuar? (1/0): ");
        resp = entrada.nextInt();
    }
      
    entrada.close();
  
  }
}