import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int base,expoente, resultado, i=1;
		Scanner leia = new Scanner(System.in);
		
		base=leia.nextInt();
        expoente = leia.nextInt();
        resultado=base*base;
        
        while(i<(expoente-1)) {
        	resultado=resultado*base;
        	i=i+1;
        }
        System.out.println(resultado);
        
	}

}

