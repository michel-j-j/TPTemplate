package test;

import java.util.ArrayList;
import java.util.List;

import model.Automovil;
import model.Hogar;
import model.Medico;
import model.Paquete;
import model.Seguro;
import model.Vida;

public class Test {

	public static void main(String[] args) {
		Seguro medico = new Medico((float) 20);
		Seguro automovil = new Automovil((float) 20);
		Seguro vida = new Vida((float) 20);
		Seguro hogar = new Hogar((float) 20);

		List<Seguro> misSeguros = new ArrayList<Seguro>();
		misSeguros.add(medico);
		misSeguros.add(automovil);
		misSeguros.add(vida);
		misSeguros.add(hogar);

		Seguro paquete = new Paquete(misSeguros, (float) 5);

		System.out.println(paquete.calcularDescuento());

	}

}
