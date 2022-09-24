import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int num, resultado,i=1;
		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva o número para saber sua tabuada");
		num=leia.nextInt();
		while(i<=10) {
           resultado = num*i;
           System.out.println(num+" X "+i+" = "+resultado);
           i=i+1;
		}
	}
}
