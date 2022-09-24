import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		int x, i, numI;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite o número para saber o seu fatorial");
		x=leia.nextInt();
		i = x-1;
		numI=x;
		while(i>=1) {
			x = x*i;
			i=i-1;
		}
		System.out.println(numI+"! = "+x);
	}
}
