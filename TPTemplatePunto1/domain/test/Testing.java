package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Director;
import model.EmpleadoRegular;
import model.Gerente;
import model.LiderProyecto;
import model.MandoMedio;
import model.Rol;

public class Testing {

	@Test
	public void calcularMontoTotal() {

		List<Rol> empleados = new ArrayList<Rol>();

		empleados.add(new EmpleadoRegular(100));
		empleados.add(new EmpleadoRegular(100));
		empleados.add(new EmpleadoRegular(100));
		empleados.add(new EmpleadoRegular(100));

		List<Rol> liderProyecto = new ArrayList<Rol>();
		liderProyecto.add(new LiderProyecto(empleados, 200));

		List<Rol> mandoMedio = new ArrayList<Rol>();
		mandoMedio.add(new MandoMedio(liderProyecto, 300));

		List<Rol> gerente = new ArrayList<Rol>();
		gerente.add(new Gerente(mandoMedio, 400));

		Rol director = new Director(gerente, 500);

		assertEquals(1800, director.calcularMontoSalarial());

	}
}
