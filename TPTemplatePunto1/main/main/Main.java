package main;

import java.util.ArrayList;
import java.util.List;

import model.Director;
import model.EmpleadoRegular;
import model.Gerente;
import model.LiderProyecto;
import model.MandoMedio;
import model.Rol;

public class Main {

	public static void main(String[] args) {

		Rol empleado1 = new EmpleadoRegular(100);
		Rol empleado2 = new EmpleadoRegular(100);
		Rol empleado3 = new EmpleadoRegular(100);
		Rol empleado4 = new EmpleadoRegular(100);
		List<Rol> empleados = new ArrayList<Rol>();

		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);

		List<Rol> liderProyecto = new ArrayList<Rol>();

		liderProyecto.add(new LiderProyecto(empleados, 200));

		List<Rol> mandoMedio = new ArrayList<Rol>();

		mandoMedio.add(new MandoMedio(liderProyecto, 300));

		List<Rol> gerente = new ArrayList<Rol>();
		gerente.add(new Gerente(mandoMedio, 400));

		Rol director = new Director(gerente, 500);

		System.out.println(director.calcularMontoSalarial());
	}

}
