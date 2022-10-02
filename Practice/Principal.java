package Practice;

public class Principal {

	public static void main(String[] args) {
		Cargar.cargar();
		
		
		Promedio.promedio(5, 4.5, 2.45, 1.9, 3.2);
		System.out.println();
		
		
		Curso estudiante1 = new Curso("Ruby", 28);
		Curso estudiante2 = new Curso("Tony", 24);
		System.out.printf("\nel estudiante #1 es %s con la edad de %d anos \n", estudiante1.getName(), estudiante1.getEdad());
		System.out.printf("el estudiante #2 es %s con la edad de %d anos \n", estudiante2.getName(), estudiante2.getEdad());
		
		
		CrearMatrices.crear(5, 5);
	}
}

