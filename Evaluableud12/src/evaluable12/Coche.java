package evaluable12;

public class Coche extends Vehiculo {
	
	private int combustible;

	public Coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}
	public Coche() {
		this(0,0,0);
	}
	
	public void repostar(int mas) {
		System.out.println("Se ha llamado al metodo respostar desde la clase Coche");
		if((combustible+mas)<60) {
			combustible += mas;
		}
		else
			System.out.println("No se puede repostar esa cantidad porque no cabe en el deposito");
	}
	public void consumir(int menos) {
		System.out.println("Se ha llamado al metodo consumir desde al clase Coche");
		if((combustible-menos)>=0) {
			combustible -= menos;
		}
		else
			System.out.println("No se puede consumir esa cantidad porque no hay suficiente combustible");
	}
	public int getCombustible() {
		System.out.println("Se ha llamado al metodo getCombustible desde la clase Coche");
		return combustible;
	}
	
	
}
