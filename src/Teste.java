
import java.util.Locale;
import java.util.Scanner;



public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notafinal;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notafinal = nota1 + nota2;
		
		if (notafinal < 60.0) {
			System.out.println("NOTA FINAL: " + (String.format("%.1f", notafinal)));
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("NOTA FINAL: " + (String.format("%.2f\n", notafinal)));
		}
		sc.close();
		
		}
	}


