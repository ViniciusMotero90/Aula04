import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/
		Scanner leitor = new Scanner();
		
		int idade, contador=0;
		double media;
		
		while(contador<10) {
			System.out.println("Por favor, informe a idade do " + (contador+1) + " Aluno");
			
			idade = leitor.nextInt();
			
			contador++;
			media +=idade;
		}
		media/=10;
		System.out.println("média de idades dos alunos da escola é " + media + " anos");
		leitor.close();
	}

}
