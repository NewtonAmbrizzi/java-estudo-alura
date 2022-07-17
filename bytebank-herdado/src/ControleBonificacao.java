
public class ControleBonificacao {

	private double somaBonificacao;


	public void registra(Funcionario funcionario) {

		double bonificacao = funcionario.getBonificacao();
		somaBonificacao += bonificacao;
	}
	
	public double getSomaBonificacao() {
		return somaBonificacao;
	}

}
