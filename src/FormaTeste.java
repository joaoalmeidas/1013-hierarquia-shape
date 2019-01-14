
public class FormaTeste {

	public static void main(String[] args) {
		
		Forma[] formas = new Forma[6];
		
		formas[0] = new Circulo(3);
		formas[1] = new Quadrado(5);
		formas[2] = new Triangulo(6);
		formas[3] = new Esfera(7);
		formas[4] = new Cubo(5);
		
		for(Forma formaAtual : formas) {
			
			System.out.println(formaAtual);
			
		}
		

	}

}
