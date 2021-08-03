import java.util.Scanner;

public class Exercicios02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int feijao = 0, i = 0;
		
		while(i!=1238) {
			feijao = leitor.nextInt();
			i = feijao;
		}
		System.out.println("Acertou");
		leitor.close();
	}

}
