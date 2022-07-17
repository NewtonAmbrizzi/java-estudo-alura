public class TesteIR {

	public static void main(String[] args) {

		double salario = 5300.0;
		double faixaIRMinimaInicial = 1900.0;
		double faixaIRMaximaInicial = 2800.0;
		double faixaIRMinimaIntermediaria = 2800.01;
		double faixaIRMaximaIntermediaria = 3751.0;
		double faixaIRMinimaFinal = 3751.01;
		double faixaIRMaximaFinal = 4664.0;

		// ifs aqui
		if (salario < faixaIRMinimaInicial) {
			System.out.println("Isento de IR");
		} else if (salario >= faixaIRMinimaInicial && salario <= faixaIRMaximaInicial) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142");
		} else if (salario >= faixaIRMinimaIntermediaria && salario <= faixaIRMaximaIntermediaria) {
			System.out.println("IR é de 15% e pode deduzir na declaração o valor de R$ 350");
		} else if (salario >= faixaIRMinimaFinal && salario <= faixaIRMaximaFinal) {
			System.out.println("IR é de 22.5% e pode deduzir na declaração o valor de R$ 636");
		} else {
			System.out.println("IR é de 27.5% e pode deduzir na declaração o valor de R$ ???");
		}

	}
}