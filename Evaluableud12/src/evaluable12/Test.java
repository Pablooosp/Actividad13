package evaluable12;

public class Test {

	public static void main(String[] args) {
		
		Coche damcar = new Coche(4, 0, 60);
		damcar.acelerar(100);
		damcar.consumir(20);
		damcar.frenar(40);
		System.out.println(damcar.getCombustible());
		System.out.println(damcar.getVelocidad());
		damcar.acelerar(30);
		damcar.consumir(10);
		damcar.frenar(90);
		damcar.acelerar(130);
		System.out.println(damcar.getCombustible());
	}

}
