package variables.and.methods;

public class Estudiantes {
	
	
	
	public static void main (String [] args) {
		Estudiante estudiante= new Estudiante ("Luis Gerardo", 12, 23, 44, "Brown","M");
		System.out.println(estudiante.getName());
		estudiante.setCalificacionFinal(9.9);
		System.out.println(estudiante.getCalificacionFinal());
	}
}
