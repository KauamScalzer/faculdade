import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro: ");
		int primeiroNumero = ler.nextInt();
		System.out.printf("Digite outro número inteiro: ");
		int segundoNumero = ler.nextInt();
		System.out.printf("Digite outro número inteiro: ");
		int terceiroNumero = ler.nextInt();
		
		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro número digitado é o maior");
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O segundo número digitado é o maior");
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O terceiro número digitado é o maior");
		} else {
			System.out.println("Não tem um número maior");
		}
	}

}
