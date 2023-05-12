package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.HistoriaUsuario;
import model.Item;
import model.Spike;
import model.Tarea;

public class Testing {

	@Test
	public void calcularTimepo() {
		List<Item> tareas = new ArrayList<Item>();

		tareas.add(new Tarea(10));
		tareas.add(new Tarea(25));
		tareas.add(new Tarea(15));

		tareas.add(new Spike(55));
		tareas.add(new Spike(55));

		Item historia = new HistoriaUsuario(tareas, 10);
		assertEquals(historia.calcularTimepo(), 170);
	}
}
