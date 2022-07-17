
public class TestaMetodo {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		boolean conseguiuRetirar = conta.saca(20);
		if (conseguiuRetirar) {
			System.out.println("Saque realizado com suceso, salto restante é de: " + conta.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}

		Conta contaCris = new Conta();
		contaCris.deposita(1000);

		if(contaCris.transfere(300, conta)) {
			System.out.println("Transferencia realizada");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(conta.saldo);
		System.out.println(contaCris.saldo);
	}
}
