import java.util.Scanner;
import java.util.Random;

public class comer {
	private static String Nome;
	private static String Classificação;
	private static String Pedido;
	private static int Pergunta;
	private static String Pagamento;
	private static String observacão;
	private static String bebida;

	public static void main(String[] args) {
		Scanner Comida = new Scanner(System.in);
		do {
			System.out.println("||||||||||||||||||||||||Cardapio da semana|||||||||||||||||||||||||" +
							   "\n|Dia    |prato principal        |acompanhamentos                  |" +
							   "\n|Segunda|Carne assada ou cozida |arroz e feijão                   |" + "\n|Terça  |Lasanha                |arroz                            |"
							   + "\n|Quarta |Frango assado ou cozido|arroz e feijão                   |" + "\n|Quinta |Feijoada               |arroz                            |" +
							   "\n|Sexta  |Escondinho de Carne    |sem acompanhamentos              |" + "\n|||||||||||||||||||||||Bebidas disponiveis|||||||||||||||||||||||||" + "\n|água mineral               |água com gás                         |" + "\n|Guaraná                    |vitamina de banana                   |" +
							   "\n|Fanta                      |                                     |" +
							   "\n|Coca cola                  |                                     |" + "\n|Sucos naturais(Uva e limão)|                                     |" + "|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.print("\nBem vindo a cantina do IFBA, para que eu possa atende-lo(a) da melhor forma, pedimos que digite o seu nome: ");
			Nome = Comida.nextLine();
		} while (Nome.length() < 2 || Nome.length() > 30);
		{
			System.out.print("\nMaravilha," + Nome);
			System.out.print(" que belo nome, agora me fala você é Aluno(a) ou servidor(ar)? ");
			Classificação = Comida.nextLine();
		}
		System.out.print("\nPerfeito " + Nome);
		System.out.print(",agora digite o seu pedido: ");
		Pedido = Comida.nextLine();

		System.out.print("\nDeseja realizar alguma alteração no pedido?");
		observacão = Comida.nextLine();

		System.out.print("\nDeseja tomar alguma bebida?");
		bebida = Comida.nextLine();

		System.out.println("\nAgora " + Nome +  " Para finalizar, me fala qual será a sua forma de pagamento,  a vista, Transferencia ou PIX?");
		Pagamento = Comida.nextLine();

		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||" + "\nNome:" + Nome);
		System.out.println("Voce é:" + Classificação);
		System.out.println("Seu pedido:" + Pedido);
		System.out.println("Observações: " + observacão);
		System.out.println("Bebidas: " + bebida);
		System.out.println("Pagamento:" + Pagamento);
		Random gerador = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println( "O numero do seu pedido é:" + gerador.nextInt(45) + "\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
			System.out.print("\nEntão," + Nome);
			System.out.print(" para eu ter certeza do seu pedido, peço que voce confirme as informações que aparecem na tela, Digite '1' para confirmar e '2' para cancelar: ");
			Pergunta = Comida.nextInt();
			if (Pergunta == 1) {
				System.out.println("\nQue maravilha! muito obrigado, aguarde um instate e em breve voce receberá o seu pedido.");
				Pergunta = Comida.nextInt();
			}	else {
				System.out.println("\nQue pena, mas eu fiquei muito agradecido em te atender " + Nome + "nossa relação não acaba aqui, quando desejar estarei aqui =).");
				System.exit(0);
			}
			Comida.close();
		}
	}
}
