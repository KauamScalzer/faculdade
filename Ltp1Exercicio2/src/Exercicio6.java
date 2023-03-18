import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite a nota da primeira prova: ");
		float primeiroNota = ler.nextFloat();
		System.out.printf("Digite a nota da segunda prova: ");
		float segundaNota = ler.nextFloat();
		System.out.printf("Digite a nota da terceira prova: ");
		float terceiraNota = ler.nextFloat();
		
		float mediaAritmetica = (primeiroNota + segundaNota + terceiraNota) / 3;
		
		if (mediaAritmetica >= 6) {
			System.out.println("O aluno foi aprovado");
		} else {
			System.out.println("O aluno foi reprovado");
		}
	}

}
