package cantina;

import java.util.Random; 
import java.util.Scanner;
import java.util.ArrayList;

public class cadastro {

    public static void main(String[] args) {
     
        Scanner l = new Scanner(System.in);
        
        System.out.println("Bem vindo á Cantina de Seu Mineiro");
        
        
        System.out.println("Digite os dados:" + "\nNome:" );
        
        String nome = l.nextLine();
        
        System.out.println("Qual o seu número de matrícula?");
        
        String matricula = l.nextLine();
        
        System.out.println("Turma:");
        
        String turma = l.nextLine();

      }

    }
    
public class Random1 { 

Random gerador = new Random(); 
for (int n = 0; n < 1; n++) {
System.out.println("sua senha é: " + gerador.nextInt(45)); 
}
 } 
   }