package evaluable12;

public class Vehiculo {

	private int ruedas;
	private int velocidad;
	
	public Vehiculo(int ruedas, int velocidad) { // Constructor
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	public Vehiculo() { //Constructor que llama al primer Constructor
		this(0, 0);
	}
	
	public void acelerar(int mas) { // Metedo acelerar
		System.out.println("Se ha llamado al metodo acelerar desde la clase Vehiculo");
		if((velocidad+mas)<120) {
			velocidad += mas;
		}
		else
			System.out.println("No se puede acelerar tanto por que superaria el limite de velocidad (120kmh)");
	}
	public void frenar(int menos) { // Metodo frenar
		System.out.println("Se ha llamado al metodo frenar desde la clase Vehiculo");
		if((velocidad-menos)>=0) {
			velocidad -= menos;
		}
		else
			System.out.println("No se puede frenar tanto por que la velocidad seria negativa");
	}
	//GETTER Y SETTERS
	public int getRuedas() {
		System.out.println("Se ha llamado al metodo getRuedas desde la clase Vehiculo");
		return ruedas;
	}
	public int getVelocidad() {
		System.out.println("Se ha llamado al metodo getVelocidad desde la clase Vehiculo");
		return velocidad;
	}
	
	
}
