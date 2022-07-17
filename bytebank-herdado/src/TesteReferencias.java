
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		
		gerente.setNome("Marcos");
		gerente.setSalario(5000);
		
		
		EditorVideo editor = new EditorVideo();
		editor.setSalario(2500);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println(controle.getSomaBonificacao());
		
	}

}
