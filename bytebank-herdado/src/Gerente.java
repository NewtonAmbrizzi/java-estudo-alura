//Gerente é um Funcionario, Gerente herda Funcionari, assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

	private AutenticadorDeSenha autenticador;

	public Gerente() {
		this.autenticador = new AutenticadorDeSenha();
	}

	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
