import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite uma letra: ");
		char letra = ler.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
			System.out.println("A letra digitada é uma vogal");
		} else if (letra == 'A' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra digitada é uma vogal");
		} else {
			System.out.println("A letra digitada é uma consoante");
		}

	}

}
