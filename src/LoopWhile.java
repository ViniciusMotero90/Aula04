import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
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
		System.out.println("m�dia de idades dos alunos da escola � " + media + " anos");
		leitor.close();
	}

}
