
public class Main {

	public static void main(String[] args) {
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 29;
		salario = 3500;
		altura = 1.68;
		genero = 'M';
		nome = "Paulo Roriz";
		
		System.out.println("IDADE = " + idade);
		System.out.println("SALARIO = " + String.format("%.2f", salario));
		System.out.println("ALTURA = " + String.format("%.2f", altura));
		System.out.println("GENERO = " + genero);
		System.out.println("NOME = " + nome);

	}

}
