package evaluable12;

public class EmpleadoDistribucion extends Asalariado {
    private String zona;
    
    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String zona) { //Constructor
        super(nombre, dni, diasVacaciones);
        this.zona = zona;
    }
    //GETTERS Y SETTERS
    public String getZona() {
        return zona;
    }
    
    public void setZona(String zona) {
        this.zona = zona;
    }
}
