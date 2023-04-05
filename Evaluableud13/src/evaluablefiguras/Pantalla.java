package evaluablefiguras;

import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<Figura> figuras = new ArrayList<>(); //ArrayList de Figuras
	
	public void implementarFigura(Figura figura) { //metodo que implementa figuras al ArrayList
		figuras.add(figura);
	}
	
	public void modificarFigura() { //metodo que modifica figuras
		System.out.println("Nuevo caracter: ");
		char modificar = sc.nextLine().charAt(0);
		figuras.forEach(figura -> figura.setCharacter(modificar)); //forEach para cambiar el cararcter de la figura
	}
	
	public void listarFiguras() { //metodo que imprime los datos de las figuras
		figuras.forEach(System.out::println); //forEach que imprime los toString de las figuras
	}
	
	public int areaPantalla() { //metodo que calcula el area total de figuras en la pantalla
		int area = 0;
		for(int i=0; i<figuras.size(); i++) {
			area += figuras.get(i).Area();
		}
		return area;
	}
	
	public void mostrarPantalla() { // metodo que imprime las figuras graficamente
		figuras.forEach(Figura::Dibujar);
	}
}
