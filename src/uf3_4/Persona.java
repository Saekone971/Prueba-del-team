package uf3_4;

public class Persona {
	private String nombre;
	private int edad;
	private String empleo;
	private double salario;

	public Persona() {}
	
	
	public Persona(String nombre, int edad, String empleo, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.empleo = empleo;
		this.salario = salario;
	}


	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getEmpleo() {
		return empleo;
	}

	public double getSalario() {
		return salario;
	}
	
	
}