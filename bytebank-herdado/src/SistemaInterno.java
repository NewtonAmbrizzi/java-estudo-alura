
public class SistemaInterno {

	int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Entrou no Sistema");
		} else {
			System.out.println("Não entrou no Sistema");

		}
	}
	
}
