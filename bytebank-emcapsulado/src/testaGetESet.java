
public class testaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("Programador");
		System.out.println(conta.getTitular().getNome());
		System.out.println(paulo.getCpf());
		System.out.println(paulo.getProfissao() );
		
	}
	
}
