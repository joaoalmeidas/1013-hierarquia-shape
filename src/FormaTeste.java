
public class FormaTeste {

	public static void main(String[] args) {
		
		Forma[] formas = new Forma[6];
		
		formas [0]= new Circulo(3);
		
		for(Forma formaAtual : formas) {
			
			System.out.println(formaAtual);
			
		}
		

	}

}
