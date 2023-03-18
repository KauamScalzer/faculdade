import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um número inteiro: ");
		int numeroInteiro = ler.nextInt();
		
		if (numeroInteiro < 0) {
			System.out.println("O seu equivalente positivo é: " + numeroInteiro * -1);
		} else {
			System.out.println("O número digitado é: " + numeroInteiro);
		}
	}
}
