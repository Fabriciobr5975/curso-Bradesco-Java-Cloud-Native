import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			System.err.println(exception.getMessage());
		}
		scanner.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		ParametrosInvalidosException.verificarNumeros(parametroUm, parametroDois);
		
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem
		
		for(int i = 0; i < contagem; i++) {
			System.out.printf("Imprimindo o número %d%n", i);
		}
		
	}
}
