
public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

			System.out.println("Tabuado do " + multiplicador);

			for (int contador = 0; contador <= 10; contador++) {

				System.out.print(contador * multiplicador + " | ");

			}
			
			System.out.println();

		}

	}

}
