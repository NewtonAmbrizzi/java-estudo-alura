
public class TestaCondicional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem 18 anos ou mais");
			System.out.println("Seja bem vindo");
		}else if(quantidadePessoas > 1){
			System.out.println("voc� n�o tem 18, mas pode entrar, "
					+ "pois est� acompanhado");
		}else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		
	}
	
}
