package variables.and.methods;

public class Estudiante extends Person {


	private int numeroControl;
	private double calificacionFinal;
	
	
	public Estudiante() {
		
	}


	public Estudiante(String name, int age, int height, int weight, String eyeColor, String gender) {
		super(name, age, height, weight, eyeColor, gender);
	}
	
	public Estudiante(String name, int age, int height, int weight, String eyeColor, String gender, int numeroControl, double calificacionFinal) {
		super(name, age, height, weight, eyeColor, gender);
		this.numeroControl=numeroControl;
		this.calificacionFinal=calificacionFinal;
	}

	
	public int getNumeroControl() {
		return numeroControl;
	}
	
	public void setNumeroControl(int numeroControl) {
		this.numeroControl = numeroControl;
	}

	public double getCalificacionFinal() {
		return calificacionFinal;
	}
	
	public void setCalificacionFinal(double calificacionFinal) {
		this.calificacionFinal = calificacionFinal;
	}
}
