import java.util.Scanner;

public class JogoAdivinha{
  public static void main (String[] args){;
    Scanner entrada = new Scanner(System.in);
    float palpite;
    System.out.println("Digite seu palpite: ");
    palpite = entrada.nextFloat();
    
    if(palpite == 15){
      System.out.println("Você acertou!");
    }
    else if (palpite<15){
      System.out.println("Seu palpite está abaixo.");
    }else{
      System.out.println("Seu palpite está acima.");
    }
      
    entrada.close();
  
  }
}