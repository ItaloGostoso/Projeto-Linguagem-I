package cantina;
import java.util.Scanner;



public class pedido {

  public static void main(String[] args) {
    
    Scanner digite = new Scanner (System.in);
    System.out.println("Olá, seja bem vindo(a)");
    System.out.println("Digite o seu codigo: ");
    int codigopessoa = digite.nextInt();
     if (codigopessoa == 100) {
       System.out.println("Olá, Aluno"); }
     else if (codigopessoa == 101) {
       System.out.println("Olá, Professor"); }
     else if (codigopessoa== 102) {
       System.out.println("Olá, Servidor"); }
     else {
       System.out.println("Olá, Cliente"); }
     
    System.out.println("Qual função pretende utilizar? ");
    System.out.println("1- Visualizar cardápio");
    System.out.println("2- Efetivar pedido");
    System.out.println("3- Cancelar pedido");
    System.out.println("4- Acessar cadastro");
    int acesso = digite.nextInt(); 
        
    if (acesso == 1) {
    System.out.println("Os pratos disponiveis são: " );
    Pratos c1 = new Pratos("Carne assada", 2);
    Pratos c2= new Pratos("Lasanha", 3);
    Pratos c3 = new Pratos("Feijoada", 4);
    Patros c4 = new Pratos("Panqueca", 5);   
    Patros c5 = new Pratos("Carne assada", 6);
    c1.exibirPrato();
    c2.exibirPrato();
    c3.exibirPrato();
    c4.exibirPrato();
    c4.exibirPrato();
    System.out.println("Digite o nome do prato que deseja escolher: " );
    String nome = digite.next();
    System.out.println("Você fez uma boa escolha!" );
    System.out.println("Aproveite seu almoço com " + nome ); 
   }
   
    else if (acesso == 2) {
      System.out.println("Digite o código prato: " );
      int codigo = digite.nextInt();
      System.out.println("Pedido efetuado com sucesso. " ); 
      }
      
    else if (acesso == 3) {
      System.out.println("Deseja prosseguir? " );
      String verifica = digite.next(); 
      
      if ( verifica == "Nao" ) {
      System.out.println("Pedido Cancelado." ); 
      }
      else {
        System.out.println("Okay, vamos finalizar seu pedido." );
      }
      
    System.out.println("Obrigada pela preferência, bom apetite!! ");  
  }
 }
}
