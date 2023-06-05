import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Portafolio {
	
	public Map<Integer, Proyecto> proyectos = new HashMap<Integer, Proyecto>();
	
	public void addProyecto(Proyecto proyecto) {
		proyectos.put(proyecto.getId(), proyecto);
	}
	
	public Proyecto getProyecto(int id) {
		for(Entry<Integer, Proyecto> e : proyectos.entrySet()){
			if(id == e.getKey())	
				return e.getValue();
			
		}
		return null;
	}
	
	public List<Proyecto> getProyectosTerminados(){
		List<Proyecto> result = new ArrayList<>();
		
		for(Entry<Integer, Proyecto> e : proyectos.entrySet()){
			if(e.getValue().esTerminado())
				result.add(e.getValue());		
			
		}
		return result;
	}
	
	public List<Proyecto> getProyectosSinTerminados(){
		List<Proyecto> result = new ArrayList<>();
		for(Entry<Integer, Proyecto> e : proyectos.entrySet()){
			if(false == e.getValue().esTerminado())
				result.add(e.getValue());		
			
		}
		return result;
	}

}
