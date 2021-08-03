import java.util.Scanner;

public class exercicios08 {

	public static void main(String[] args) {
		Scanner  leitor = new Scanner(System.in);
		
		int i =0;
		double nota = 0,media = 0;
		
		while(i<=10) {
			System.out.println("Nota do "+i+" aluno");
			nota = leitor.nextDouble();
			media+=nota;
			i++;
		}
		media/=10;
		System.out.println(media);
		
	}

}
