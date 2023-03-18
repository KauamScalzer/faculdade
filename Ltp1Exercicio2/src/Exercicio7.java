import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite o seu peso: ");
		float peso = ler.nextFloat();
		System.out.printf("Digite a sua altura: ");
		float altura = ler.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println("A sua classificação é magreza");
		} else if (imc < 24.9) {
			System.out.println("A sua classificação é normal");
		} else if (imc < 29.9) {
			System.out.println("A sua classificação é sobrepeso");
		} else if (imc < 39.9) {
			System.out.println("A sua classificação é obesidade");
		} else {
			System.out.println("A sua classificação é obesidade grave");
		}
	}

}
