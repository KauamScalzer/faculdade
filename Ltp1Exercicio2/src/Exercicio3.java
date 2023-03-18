import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro: ");
		int numeroInteiro = ler.nextInt();
		
		if (numeroInteiro <= 10 && numeroInteiro >= 0) {
			System.out.println("O digitado está entre 0 e 10");
		} else {
			System.out.println("O digitado não está entre 0 e 10");
		}
	}
}
