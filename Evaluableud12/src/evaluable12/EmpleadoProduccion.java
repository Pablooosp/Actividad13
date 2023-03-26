package evaluable12;

public class EmpleadoProduccion extends Asalariado{
	
	    private String turno;
	    
	    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) { //Constructor
	        super(nombre, dni, diasVacaciones);
	        this.turno = turno;
	    }
	    //GETTERS Y SETTERS
	    public String getTurno() {
	        return turno;
	    }
	    
	    public void setTurno(String turno) {
	        this.turno = turno;
	    }
	    
	}

