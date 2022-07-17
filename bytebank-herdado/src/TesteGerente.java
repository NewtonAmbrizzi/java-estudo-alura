
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Marco");
		gerente.setCpf("123.456.789-00");
		gerente.setSalario(5000);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());
		
	}
	
}
