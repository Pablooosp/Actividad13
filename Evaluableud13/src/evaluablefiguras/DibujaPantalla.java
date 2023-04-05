package evaluablefiguras;

import java.util.Scanner;

public class DibujaPantalla {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Pantalla pantalla = new Pantalla(); //creamos objeto pantalla
		
		String opcionMenu = ""; //inicializamos y declaramos el atributo opcionMenu
		while(opcionMenu != "f") {
			opcionMenu = menu();
			switch(opcionMenu) { //Switch con todos las opciones del menu
			case "A": //Implementa figuras
				System.out.println("Rectangulo(R) o Triangulo(T): ");
				String opcionFigura = sc.nextLine().toLowerCase();
				if (opcionFigura.equals("r")) {
                    System.out.println("Indica la base:");
                    int base = sc.nextInt();
                    System.out.println("Indica la altura:");
                    int altura = sc.nextInt();
                    System.out.println("Indica el caracter:");
                    char carac = sc.next().charAt(0);
                    Rectangulo r = new Rectangulo(base, altura, carac);
                    pantalla.implementarFigura(r);
                    System.out.println("Figura Rectangulo(" + base + " " + altura + " " + carac + ") implementada");
                } else if (opcionFigura.equals("t")) {
                    System.out.println("Indica el lado: ");
                    int lado = sc.nextInt();
                    System.out.println("Indica el tipo a, b, c o d: ");
                    sc.nextLine();
                    String tipo = sc.nextLine().toLowerCase();
                    if (!(tipo.matches("[a-d]"))) {
                        System.out.println("Tipo de rectangulo no valida");
                        break;
                    }
                    System.out.println("Indica el caracter:");
                    char carac = sc.nextLine().charAt(0);
                    Triangulo t = new Triangulo(lado, tipo, carac);
                    pantalla.implementarFigura(t);
                    System.out.println("Figura Triangulo(" + lado + " " + tipo + " " + carac + ") implementada");
                } else {
                    System.out.println("Opcion no valida");
                }
                break;
            case "B": 
                pantalla.modificarFigura();
                break;
            case "C": 
                pantalla.mostrarPantalla();
                break;
            case "D": 

                System.out.println("Area total: " + pantalla.areaPantalla());

                break;
            case "E": 
                pantalla.listarFiguras();
                break;
            case "F": 
                break;
            default:
                System.out.println("Opcion no valida");
                break;
			}
		}
		
		
		
		
}
	static String menu() { //funcion para el menu
	        System.out.println("\nSelecciona una opcion [a-f]: ");
	        System.out.println("A- Añadir una figura\nB- Modificar una figura\nC- Dibujar figuras\nD- Area de las figuras\nE- Listar figuras\nF- Salir\nOpcion: ");
	        String op = sc.nextLine();
	        if(op.isEmpty())
	        	op = sc.nextLine();
	        op.charAt(0);
	        return op;
	    
		
	}

}
