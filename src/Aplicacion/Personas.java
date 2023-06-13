package Aplicacion;

import java.util.HashMap;

public class Personas {
	/*
	 * 
	 * Crear una lista para almacenar las personas
	 */
	private HashMap<String, Integer> listadoPersonas;
	/*
	 * 
	 * Lanzar una excepcion si la persona es correcta
	 */
	public Personas() {
		listadoPersonas = new HashMap<>();
	}
	/*
	 * 
	 * Comprueba que no introduzcan edades erroneas y que no exista mas de una persona igual
	 */
	public void vaciar(){
		listadoPersonas.clear();
	}
	
	public void addPersona(String nombre, int edad) throws Exception {	
		if(edad < 0) {
			throw new Exception("Edad incorrecta");
		}else if(listadoPersonas.containsKey(nombre)){
			throw new Exception("Ya existe una persona con el nombre "+nombre);
		}else{
			listadoPersonas.put(nombre, edad);
		}
	}
	/*
	 * 
	 * Si no hay personas te muestra que no hay y si hay calcula la edad maxima
	 */
	public int edadMinima() throws Exception {
		if(listadoPersonas.isEmpty()) {
			throw new Exception("No hay personas");
		}else {
			int minimo = Integer.MAX_VALUE;
			for(int edad : listadoPersonas.values()) {
				if(edad < minimo) {
					minimo = edad;
				}
			}
			/*
			 * 
			 * Devuelve la temperatura minima
			 */
			return minimo;
		}
	}
	
}
