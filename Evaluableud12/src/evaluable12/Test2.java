package evaluable12;

public class Test2 {

	public static void main(String[] args) {
		//Inicializamos los objetos
        EmpleadoProduccion empProd = new EmpleadoProduccion("Jose", 1234567890, 22, "Tarde");
        
        EmpleadoDistribucion empDist = new EmpleadoDistribucion("Francisco", 987654321, 21, "Sur");
        //Devolvemos por pantalla los datos de los objetos
        System.out.println("EmpleadoProduccion [Turno: " + empProd.getTurno() + ", Nombre: " + empProd.getNombre() + ", Dni: " + empProd.getDni() + ", DiasVacaciones: " + empProd.getDiasVacaciones()+"]");
        
        System.out.println("EmpleadoProduccion [Zona: " + empDist.getZona() + ", Nombre: " + empDist.getNombre() + ", Dni: " + empDist.getDni() + ", DiasVacaciones: " + empDist.getDiasVacaciones()+"]");

	}

}
