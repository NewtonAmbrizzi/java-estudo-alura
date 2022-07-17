package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(123, 4567);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(456, 8901);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		System.out.println(cc.getSaldo() + " CC");
		System.out.println(cp.getSaldo() + " CP");
	}

}
