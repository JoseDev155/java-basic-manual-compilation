interface Persona {
	String getNombre();
}

class Estudiante implements Persona {
	public int carnet_estudiante;
	public String nombre;
	public String carrera;
	
	public Estudiante() {
		this.carnet_estudiante = 0;
		this.nombre = "";
		this.carrera = "";
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}
}

public class Practica {
	static void saludar(Persona p) {
		System.out.println("Nombre: " + p.getNombre());
	}

	public static void main(String[] args) {
		Estudiante es = new Estudiante();
		es.carnet_estudiante = 122393;
		es.nombre = "Pepe";
		es.carrera = "Medicina";

		saludar(es);
	}
}