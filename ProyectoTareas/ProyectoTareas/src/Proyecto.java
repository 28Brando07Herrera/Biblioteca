import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	
	private int id;
	
	public Proyecto(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	private List<Tarea> tareas = new ArrayList<Tarea>();
	
	public void addTarea(Tarea tarea) {
		tareas.add(tarea);
	}
	
	public Tarea getTarea(int id) {
		for(Tarea t: tareas) {
			if(t.getId() == id)
				return t;
		}
		return null;
	}
	
	public void terminarTarea(int id) {
		for(Tarea t: tareas) {
			if(t.getId() == id)
				t.setEstado(2);
		}
	}
	
	public boolean esTerminado() {
		if(getTareasSinTerminar().size() == 0)
			return true;
		
		return false;
	}
	
	public List<Tarea> getTareasSinTerminar(){
		List<Tarea> result = new ArrayList<>();
		for(Tarea t: tareas) {
			if(t.getEstado() != 2)
				result.add(t);
		}
		return result;
	}
	
	public List<Tarea> getTareasTerminadas(){
		List<Tarea> result = new ArrayList<>();
		for(Tarea t: tareas) {
			if(t.getEstado() == 2)
				result.add(t);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", tareas=" + tareas + "]";
	}

	
}
