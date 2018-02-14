package uf3_4;

public class UsoPersona {

	public static void main(String[] args) {
		Persona objPersona = new Persona("Ana", 25, "comercial", 30000);
		System.out.println(objPersona.getNombre());
		System.out.println(objPersona.getEdad());
		System.out.println(objPersona.getEmpleo());
		System.out.println(objPersona.getSalario());
	}

}