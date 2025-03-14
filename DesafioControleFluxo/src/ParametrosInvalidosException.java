
public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
	
	public static void verificarNumeros(int n1, int n2) throws ParametrosInvalidosException  {
		if(n1 > n2) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}
