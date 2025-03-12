import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				// Entrada de dados e Processamento
				int numeroAgencia = pegarNumeroAgencia(scanner);
				String agencia = pegarAgencia(scanner);
				String nomeCliente = pegarNomeCliente(scanner);
				double saldo = pegarSaldoCliente(scanner);

				// Saída dos dados;
				System.out.printf("%nNúmero da Agência: %d%nAgência: %s%nNome do Cliente: %s%nSaldo: R$ %.2f%n",
						numeroAgencia, agencia, nomeCliente, saldo);

				scanner.close();
				break;
			} catch (Exception ex) {
				if (ex instanceof InputMismatchException) {
					System.out.println("Você digitou um valor inválido no campo númerico");
					// Voltando para o inicio do programa
					scanner.next();
					System.out.println();
				} else {
					System.out.println("Erro: " + ex.getMessage());
				}
			}
		}
	}

	/**
	 * Método para pegar o número da agência do usuário
	 * 
	 * @param scanner Recebe um objeto do tipo Scanner para realizar a leitura dos
	 *                dados via console
	 * @return Retorna o número da agência válido
	 * 
	 * @throws Exception Se o valor passado não for um número
	 */
	public static int pegarNumeroAgencia(Scanner scanner) throws Exception {
		System.out.println("Digite o número da agência:");
		int numeroAgencia = scanner.nextInt();

		while (numeroAgencia <= 0) {
			System.out.println("Numero da agência inválido, digite novamente:");
			numeroAgencia = scanner.nextInt();
		}

		return numeroAgencia;

	}

	/**
	 * Método para pegar o nome da agência do usuário
	 * 
	 * @param scanner - Recebe um objeto do tipo Scanner para realizar a leitura dos
	 *                dados via console
	 * 
	 * @return Retorna o nome da agência
	 */
	public static String pegarAgencia(Scanner scanner) {
		System.out.println("Digite o nome da agência:");
		String agencia = scanner.next();

		while (agencia.trim().equals("") || agencia == null) {
			System.out.println("Agência inválida, digite novamente:");
			agencia = scanner.nextLine();
		}

		return agencia;
	}

	/**
	 * Método para pegar o nome do cliente
	 * 
	 * @param scanner Recebe um objeto do tipo Scanner para realizar a leitura dos
	 *                dados via console
	 * 
	 * @return Retorna o nome do cliente
	 */
	public static String pegarNomeCliente(Scanner scanner) {
		System.out.println("Digite o nome do cliente:");
		String nomeCliente = scanner.next();

		while (nomeCliente.trim().equals("") || nomeCliente == null) {
			System.out.println("Nome inválido, digite novamente:");
			nomeCliente = scanner.nextLine();
		}

		return nomeCliente;
	}

	/**
	 * Método para pegar o saldo do cliente
	 * 
	 * @param scanner - Recebe um objeto do tipo Scanner para realizar a leitura dos
	 *                dados via console
	 * @return Retorna o saldo válido do cliente
	 * @throws Exception Se o valor passado não for um número
	 */
	public static double pegarSaldoCliente(Scanner scanner) throws Exception {
		System.out.println("Digite o saldo do cliente:");
		double saldoUsuario = scanner.nextDouble();

		while (saldoUsuario < 0) {
			System.out.println("Saldo inválido, digite novamente:");
			saldoUsuario = scanner.nextDouble();
		}

		return saldoUsuario;
	}
}
