import java.util.Scanner;

public class ParImpar{
  public static void main (String[] args){;
    Scanner entrada = new Scanner(System.in);
    float num;
    System.out.println("Digite um número: ");
    num = entrada.nextFloat();
    
    if((num%2)==0){
      System.out.println(num + " = par");
    }
    else{
      System.out.println(num + " = ímpar");
    }
      
    entrada.close();
  
  }
}