package evaluablefiguras;

public class Triangulo implements Figura{
	
	private int lado;
	private String tipo;
	private char carac;
	
	
	public Triangulo(int lado, String tipo, char carac) {
		this.lado=lado;
		this.tipo=tipo;
		this.carac=carac;
	}
	
	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Triangulo";
	}

	@Override
	public void Dibujar() { // Imprime los triangulos segun su tipo
		// TODO Auto-generated method stub
		switch(tipo) {
			case "a":
				
			break;
			case "b":
				
			break;
			case "c":
				
			break;
			case "d":
				
			break;
		}
		
	}

	@Override
	public int Area() {
		// TODO Auto-generated method stub
		return (lado*lado)/2;
	}

	@Override
	public void setCharacter(char c) {
		// TODO Auto-generated method stub
		this.carac = c;
		
	}

	@Override
	public char getCharacter() {
		// TODO Auto-generated method stub
		return carac;
	}

	@Override
	public String toString() {
		return "Triangulo [lado=" + lado + ", tipo=" + tipo + ", carac=" + carac + "]";
	}
	

}
