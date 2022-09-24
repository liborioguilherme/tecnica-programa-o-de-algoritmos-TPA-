
public class Altura {

	public static void main(String[] args) {
		double alturaJ=134, alturaP=145;
		int ano=1;
		
		
		while(alturaJ<=alturaP) {
			alturaJ=alturaJ+2.5;
			alturaP=alturaP+2;
			ano=ano+1;
		}
		System.out.println("Em "+ano+" anos, João será maior que Pedro");
	}

}
