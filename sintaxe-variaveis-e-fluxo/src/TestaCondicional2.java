
public class TestaCondicional2 {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Voc� tem 18 anos ou mais");
			System.out.println("Seja bem vindo");
		}else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		
		
		
	}
	
}