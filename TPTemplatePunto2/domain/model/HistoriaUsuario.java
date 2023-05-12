package model;

import java.util.List;
import java.util.Objects;

public class HistoriaUsuario implements Item {

	private List<Item> tareas;
	private Integer tiempo;

	public HistoriaUsuario(List<Item> tareas, Integer tiempo) {
		this.tareas = Objects.requireNonNull(tareas);
		this.tiempo = Objects.requireNonNull(tiempo);
	}

	@Override
	public Integer calcularTimepo() {
		Integer total = tiempo;
		for (Item tarea : tareas) {
			total += tarea.calcularTimepo();
		}
		return total;
	}

}
