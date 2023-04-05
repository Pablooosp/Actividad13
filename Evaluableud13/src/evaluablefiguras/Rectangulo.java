package evaluablefiguras;

public class Rectangulo implements Figura{
	
	private int base;
	private int altura;
	private char carac;
	
	public Rectangulo(int base, int altura, char carac) {
		this.base=base;
		this.altura=altura;
		this.carac=carac;
	}

	@Override
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Rectangulo";
	}

	@Override
	public void Dibujar() {
		// TODO Auto-generated method stub
		for(int i = 0; i<altura; i++) {
			for(int x = 1; x<base; x++) {
				if(x==1) {
					System.out.print("\n"+carac);
				}
				System.out.print(carac);
			}
		}
		
	}

	@Override
	public int Area() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public void setCharacter(char c) {
		// TODO Auto-generated method stub
		this.carac=c;
		
	}

	@Override
	public char getCharacter() {
		// TODO Auto-generated method stub
		return carac;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", carac=" + carac + "]";
	}
	

}
