
public class Somatoria {

	public static void main(String[] args) {
		int i=1, soma=2;
		while(i<100) {
			soma = i+soma;
			i=i+1;
			if(i<100) {
				soma=soma+1;
			}
		}
		System.out.println("A somat�ria dos n�meros entre 1 e 100 �: "+soma);
	}

}
