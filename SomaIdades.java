import java.util.Scanner;

public class SomaIdades{
  public static void main (String[] args){;
    Scanner entrada = new Scanner(System.in);
    int idade, acumuladorIdades = 0;
    int cont;
    
    for (cont = 0; cont<5; cont++){
      System.out.println("Digite sua idade: ");
      idade = entrada.nextInt();
      acumuladorIdades += idade;
    }
    
   System.out.println("A soma das idades é " + acumuladorIdades);
      
    entrada.close();
  
  }
}