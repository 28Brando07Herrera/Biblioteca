import java.time.LocalDate;

public class Tarea {
	private int id;
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	// 0: sin empezar, 1: en proceso, 2: terminado
	private int estado;
	
	public Tarea(int id, String nombre, LocalDate inicio, LocalDate fin, int estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getInicio() {
		return inicio;
	}
	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Tarea [estado=" + estado + ", fin=" + fin + ", id=" + id + ", inicio=" + inicio + ", nombre=" + nombre
				+ "]";
	}

	

}
