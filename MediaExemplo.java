/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class MediaExemplo{
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite primeira nota:");
        double nota1 = entrada.nextDouble();
         System.out.println("Digite segunda nota:");
        double nota2= entrada.nextDouble();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média é : " + media);
        entrada.close();
        
    }
}
