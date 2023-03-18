import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro: ");
		int numeroInteiro = ler.nextInt();
		
		if (numeroInteiro %2 == 0) {
			System.out.println("O digitado é par");
		} else {
			System.out.println("O digitado é impar");
		}
	}

}
