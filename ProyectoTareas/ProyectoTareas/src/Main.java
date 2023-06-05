import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Tarea t1 = new Tarea(1, "Tarea 1", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t2 = new Tarea(2, "Tarea 2", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t3 = new Tarea(3, "Tarea 3", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t4 = new Tarea(4, "Tarea 4", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t5 = new Tarea(5, "Tarea 5", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 0);
		
		Proyecto pr1 = new Proyecto(1);
		pr1.addTarea(t1);
		pr1.addTarea(t2);
		pr1.addTarea(t3);
		pr1.addTarea(t4);
		pr1.addTarea(t5);
		
		Tarea t6 = new Tarea(6, "Tarea 6", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t7 = new Tarea(7, "Tarea 7", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t8 = new Tarea(8, "Tarea 8", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t9 = new Tarea(9,"Tarea 9", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		Tarea t10 = new Tarea(10, "Tarea 10", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 2);
		
		Proyecto pr2 = new Proyecto(2);
		pr2.addTarea(t6);
		pr2.addTarea(t7);
		pr2.addTarea(t8);
		pr2.addTarea(t9);
		pr2.addTarea(t10);
		
		Tarea t11 = new Tarea(11, "Tarea 11", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t12 = new Tarea(12, "Tarea 12", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t13 = new Tarea(13, "Tarea 13", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t14 = new Tarea(14,"Tarea 14", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		Tarea t15 = new Tarea(15, "Tarea 15", LocalDate.of(2022, 2, 21), LocalDate.of(2022, 2, 26), 1);
		
		Proyecto pr3 = new Proyecto(3);
		pr3.addTarea(t11);
		pr3.addTarea(t12);
		pr3.addTarea(t13);
		pr3.addTarea(t14);
		pr3.addTarea(t15);
		
		Portafolio portafolio = new Portafolio();
		portafolio.addProyecto(pr1);
		portafolio.addProyecto(pr2);
		portafolio.addProyecto(pr3);




		System.out.print(pr1.esTerminado());
		
		for (Tarea t : pr1.getTareasSinTerminar())
            System.out.println(t);
		pr1.terminarTarea(3);
		pr1.terminarTarea(4);		
		pr1.terminarTarea(5);
		System.out.println("\n");
		for (Tarea t : pr1.getTareasTerminadas())
            System.out.println(t);

		System.out.print(portafolio.getProyecto(2));

		
		
		
		System.out.println(portafolio.getProyectosTerminados());

		// <1> Proyecto terminado
		// <2> Proyecto sin terminar
		// <3> Buscar tareas terminadas en un proyecto
		// <4> Buscar tareas sin terminar en un proyecto
		// <5> terminar tareas en un proyecto
		
		
		
	}

}
