package Practice;

public class Curso {
	private String nombre;
	private int edad;
	
	public Curso(String n, int a) {
		this.nombre = n;
		this.edad = a;
	}
	
	public String getName() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
}
