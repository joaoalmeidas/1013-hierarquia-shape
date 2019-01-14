
public class FormaTeste {

	public static void main(String[] args) {
		
		Forma[] formas = new Forma[6];
		
		formas[0] = new Circulo(5);
		formas[1] = new Quadrado(5);
		formas[2] = new Triangulo(5);
		formas[3] = new Esfera(5);
		formas[4] = new Cubo(5);
		formas[5] = new Tetraedro(5);
		
		for(Forma formaAtual : formas) {
			
			System.out.println(formaAtual);
			
		}
		

	}

}
