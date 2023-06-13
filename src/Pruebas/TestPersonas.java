package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Aplicacion.Personas;

class TestPersonas {

	Personas estacion = new Personas();
	
	@Test
	void test1() throws Exception{
		estacion.addPersona("Pedro",22);
		estacion.addPersona("Juan",20);
		assertEquals(20,estacion.edadMinima());
	}
	@Test
	void test2() throws Exception {
		estacion.addPersona("Ana",18);
		estacion.vaciar();
		assertThrows(Exception.class,()->estacion.edadMinima());
	}
	

}
